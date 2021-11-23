public static void main(final java.lang.String[] args) throws java.io.IOException {
    startEmbeddedHttpContainer();
    try {
        java.util.logging.Logger.getGlobal().log(java.util.logging.Level.INFO, "Enter \"quit\" to stop.");
        final java.io.BufferedReader charSource = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
        while (!("quit".equals(charSource.readLine())));
    } finally {
        de.sb.broker.rest.ServiceTest.stopEmbeddedHttpContainer();
    }
}