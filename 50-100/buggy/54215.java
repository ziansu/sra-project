public static java.lang.String parsedContentType(java.lang.String ct) {
    java.lang.String[] s1 = ct.split(",");
    for (java.lang.String s : s1) {
        java.lang.String[] p = s.split(";");
        return p[0];
    }
    return "";
}