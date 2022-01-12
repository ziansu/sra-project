public static boolean isPangram(java.lang.String s) {
    boolean[] check = new boolean[128];
    for (int i = 0; i < ((s.length()) - 1); i++) {
        int val = s.charAt(i);
        if (!(check[val])) {
            check[val] = true;
        }
    }
    return string.Pangrams.checkingTheArray(check);
}