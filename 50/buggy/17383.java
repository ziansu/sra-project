private void logMessage(java.lang.String label, int value) {
    java.lang.String msg = java.lang.String.format((label + " = %d%n"), value);
    java.lang.System.out.println(msg);
    textLog.append(msg);
}