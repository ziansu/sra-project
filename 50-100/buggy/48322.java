private java.lang.String getStackTrace(java.lang.Throwable t) {
    if (t == null) {
        return null;
    }
    final java.io.StringWriter sw = new java.io.StringWriter();
    final java.io.PrintWriter pw = new java.io.PrintWriter(sw);
    t.printStackTrace(pw);
    pw.flush();
    return sw.toString();
}