public java.lang.String compress(java.lang.String str) {
    java.lang.String rv = "";
    for (int i = 0; i < (str.length()); i++) {
        rv += encoder.get(str.charAt(i));
    }
    return rv;
}