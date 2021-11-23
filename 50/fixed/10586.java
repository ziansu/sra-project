public java.lang.Boolean run() {
    final java.lang.String str = java.lang.System.getProperty("glass.disableThreadChecks", "false");
    return "true".equalsIgnoreCase(str);
}