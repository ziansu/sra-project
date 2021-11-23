private void PrintsToRIO(java.lang.String errorMessage) {
    try {
        final java.io.PrintWriter log = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter(this.errorlogLocation, true)));
        log.print((errorMessage + "\n"));
        log.close();
    } catch (final java.io.IOException e) {
        e.printStackTrace();
        java.lang.System.out.println("More errors with your error?");
    }
}