private java.lang.String calc(java.lang.String input) {
    java.lang.StringBuilder ret = new java.lang.StringBuilder(input.length());
    for (int i = 0; i < (input.length()); i++) {
        ret.append(((input.charAt(i)) + 1));
    }
    return ret.toString();
}