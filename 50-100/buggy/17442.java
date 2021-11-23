private void escape(java.lang.String line) {
    line = line.replace("&", "&amp;");
    line = line.replace("\"", "&quot;");
    line = line.replace("<", "&lt;");
    line = line.replace(">", "&gt;");
}