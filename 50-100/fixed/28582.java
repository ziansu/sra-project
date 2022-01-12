public static int getIntegerInput(java.lang.String prompt) {
    int value = -1;
    while (value < 0) {
        try {
            java.lang.System.out.print(prompt);
            value = rmi.common.InputValidation.input.nextInt();
            rmi.common.InputValidation.input.nextLine();
        } catch (java.util.InputMismatchException ime) {
            java.lang.System.err.println("Incorrect entry. Please input only a positive integer.");
            rmi.common.InputValidation.input.nextLine();
        }
    } 
    return value;
}