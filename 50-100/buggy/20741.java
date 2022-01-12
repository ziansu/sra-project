private void logFile(java.lang.String logMessage) {
    try (java.io.FileWriter fileLogging = new java.io.FileWriter(className, true)) {
        fileLogging.write(((((java.time.LocalDateTime.now()) + " ") + logMessage) + "\n"));
        fileLogging.close();
    } catch (java.io.IOException exc) {
        java.lang.System.out.println("Logging failed");
    }
}