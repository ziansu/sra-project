private static void expectString(java.util.Scanner scanner, java.lang.String identifier) {
    java.lang.String s = scanner.next();
    if (!(identifier.equals(s))) {
        java.lang.String error = (("Expectation mismatch: " + identifier) + " != ") + s;
        java.lang.System.err.println(error);
    }
}