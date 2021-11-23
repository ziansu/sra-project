public java.lang.String join(java.lang.String sep, java.lang.String[] the) {
    java.lang.String a = "";
    for (int i = 0; i < (the.length); i++) {
        a = (a + sep) + (the[i]);
    }
    return a.substring(2);
}