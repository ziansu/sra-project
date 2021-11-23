private void logResult(java.lang.String status, java.lang.String message) {
    java.lang.StringBuilder buf = new java.lang.StringBuilder();
    if (org.testng.internal.Utils.isStringNotBlank(status)) {
        buf.append(status).append(": ");
    }
    buf.append(message);
    java.lang.System.out.println(buf);
}