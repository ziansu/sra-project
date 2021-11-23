public static void printErrors() {
    for (java.lang.String error : Utility.ErrorHandling.errors) {
        java.lang.System.out.print((error + "\n"));
    }
}