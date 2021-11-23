private void logMessage(java.lang.String label, int value) {
    java.lang.String msg = java.lang.String.format((label + " = %d%n"), value);
    textLog.append(msg);
}