public static void main(java.lang.String[] args) {
    final int DAYS = 30;
    double money = 0.01;
    int day = 1;
    while (day < DAYS) {
        money = 2 * money;
        java.lang.System.out.println(((("After day " + day) + " you have ") + money));
    } 
}