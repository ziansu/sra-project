public java.lang.String translateMessages(java.lang.String s) {
    if (s.contains("''")) {
        s = s.replaceAll("''", "'");
    }
    if (s.contains("^'")) {
        s = s.replaceAll("^'", "");
    }
    if (s.contains("'$")) {
        s = s.replaceAll("'$", "");
    }
    return s;
}