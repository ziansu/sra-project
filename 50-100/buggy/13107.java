private static java.lang.String formatException(final java.lang.Throwable ex) {
    if (ex == null) {
        return "";
    }
    java.io.StringWriter sw = new java.io.StringWriter();
    java.io.PrintWriter pw = new java.io.PrintWriter(sw);
    ex.printStackTrace(pw);
    return sw.toString().replaceAll("<", "&lt;").replaceAll(">", "&gt;");
}