private static void numDividedToThreeOrSeven() {
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Enter your N number: ");
    int n = input.nextInt();
    for (int i = 1; i <= n; i++) {
        if (((i % 7) == 0) && ((i % 3) == 0)) {
            java.lang.System.out.println(i);
        }
    }
    input.close();
}