public static int[] horzCat(int[] m1, int... m2) {
    int tcols = (m1.length) + (m2.length);
    int[] M = new int[tcols];
    java.lang.System.arraycopy(m1, 0, M, 0, m1.length);
    java.lang.System.arraycopy(m2, 0, M, m1.length, m2.length);
    return M;
}