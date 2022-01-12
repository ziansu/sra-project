public static void main(java.lang.String[] args) {
    {
        @java.lang.SuppressWarnings(value = "resource")
        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
        java.lang.System.out.println("Enter maximum integer to be checked:");
        assignment4.Assignment4.max = sc.nextInt();
    }
    try {
        assignment4.SieveofErastosthenes.printMyPrimeNumbers(max1);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Parsing Error!");
    }
}