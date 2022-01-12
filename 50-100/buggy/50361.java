public int hash(java.lang.String data) {
    char[] c = data.toCharArray();
    int n = 10000000;
    for (int i = 0; i < (c.length); i++) {
        n = n * (c[i]);
    }
    return n;
}