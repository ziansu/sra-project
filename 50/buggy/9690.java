private java.lang.String escapeString(java.lang.String str) {
    return str.replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r").replace("\\", "\\\\");
}