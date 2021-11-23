private static int getIntegerInput(java.util.Scanner input) {
    try {
        return input.nextInt();
    } catch (java.util.InputMismatchException e) {
        java.lang.System.out.println("Invalid input. Please enter an integer.");
        input.next();
        return ZeroBank.getIntegerInput(input);
    }
}