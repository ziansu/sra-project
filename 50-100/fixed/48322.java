private java.lang.String getStackTrace(final java.lang.Throwable t) throws java.io.IOException {
    if (t == null) {
        return null;
    }
    try (final java.io.StringWriter sw = new java.io.StringWriter();final java.io.PrintWriter pw = new java.io.PrintWriter(sw)) {
        t.printStackTrace(pw);
        pw.flush();
        return sw.toString();
    }
}