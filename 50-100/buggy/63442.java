private static double scan_double(java.lang.String prompt) {
    boolean got = false;
    double target = 0.0;
    while (!got) {
        try {
            java.lang.System.out.print(prompt);
            target = Main.scanner.nextDouble();
            java.lang.System.out.println();
            Main.scanner.nextLine();
            got = true;
        } catch (java.util.InputMismatchException e) {
            Main.scanner.nextLine();
            java.lang.System.out.println("\nERROR: Input must be a floating point number.\n");
            got = false;
        }
    } 
    return target;
}