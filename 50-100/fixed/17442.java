private java.lang.String escape(java.lang.String str) {
    java.lang.String line = str;
    line = line.replace("&", "&amp;");
    line = line.replace("\"", "&quot;");
    line = line.replace("<", "&lt;");
    line = line.replace(">", "&gt;");
    return line;
}