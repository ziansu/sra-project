private int getHash(java.lang.String s) {
    for (int i = 0; i < (s.length()); i++) {
        value = ((value) * 33) + (s.charAt(i));
    }
    return value = (value) % (TABLESIZE);
}