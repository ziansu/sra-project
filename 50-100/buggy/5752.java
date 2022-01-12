public java.lang.String join(java.lang.String sep, java.lang.String[] the) {
    java.lang.String a = "";
    for (int j = 0; j < (the.length); j++) {
        a = (a + sep) + (the[j]);
    }
    return a.substring(2);
}