public int[] getLasts(java.lang.String pattern) {
    int[] res = new int[100000];
    for (int i = 0; i < 128; i++) {
        res[i] = -1;
    }
    for (int i = 0; i < (pattern.length()); i++) {
        res[pattern.charAt(i)] = i;
    }
    return res;
}