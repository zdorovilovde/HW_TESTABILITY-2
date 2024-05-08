public class main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int myBmi = service.calculate(1.87, 98);
        System.out.println(myBmi);
    }
}
