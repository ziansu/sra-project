public static int readInt(java.util.Scanner scanner, java.lang.String message) {
    java.lang.Integer res = null;
    do {
        java.lang.System.out.print((message + " "));
        try {
            res = scanner.nextInt();
            scanner.nextLine();
        } catch (java.util.InputMismatchException e) {
            java.lang.System.out.println("Invalid value");
            scanner.nextLine();
        }
    } while (res == null );
    return res;
}