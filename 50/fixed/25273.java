static void escapeValueOnto(java.lang.Object o, java.io.Writer out) throws java.io.IOException {
    new com.google.autoesc.JSValueEscaper(out).escape(o, true);
}