public java.lang.Integer getIntegerInput(java.io.InputStream readFrom) {
    java.lang.Boolean valid = true;
    java.lang.Integer returnable = null;
    do {
        try {
            java.util.Scanner scanner = new java.util.Scanner(readFrom);
            returnable = scanner.nextInt();
            valid = true;
            scanner.close();
        } catch (java.util.InputMismatchException e) {
            java.lang.System.out.println("Por favor, Ingrese un valor entero");
            valid = false;
        }
    } while (!valid );
    return returnable;
}