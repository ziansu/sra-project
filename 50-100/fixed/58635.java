private static boolean linked(java.lang.String w1, java.lang.String w2) {
    int j = 0;
    for (int i = 0; i < (w1.length()); i++) {
        if ((w1.charAt(i)) != (w2.charAt(i))) {
            j++;
        }
    }
    return j == 1;
}