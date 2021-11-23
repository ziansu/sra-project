public static java.lang.String padToWidth(java.lang.String s1, int width, java.lang.String s2) {
    int n = width - (s2.length());
    if (n <= 0) {
        s1 = s1.substring(0, (((s1.length()) + n) - 1));
        n = 1;
    }
    return (java.lang.String.format((("%1$-" + n) + "s"), s1)) + s2;
}