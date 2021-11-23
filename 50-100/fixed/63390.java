public void clearErrorlog() {
    try {
        final java.io.PrintWriter log = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter(errorlogLocation, false)));
        log.print("\n");
        log.close();
    } catch (final java.io.IOException e) {
        e.printStackTrace();
    }
}