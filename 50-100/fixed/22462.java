public java.lang.Integer getIntegerInput(java.io.InputStream readFrom) {
    java.lang.Boolean valid = true;
    java.lang.Integer returnable = null;
    do {
        valid = true;
        try {
            java.util.Scanner scanner = new java.util.Scanner(readFrom);
            returnable = scanner.nextInt();
            scanner.close();
        } catch (java.lang.Exception e) {
            java.lang.System.out.println(e);
            valid = false;
        }
    } while (!valid );
    return returnable;
}