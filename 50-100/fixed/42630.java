public static int[] append(int[] lhs, int[] rhs) {
    int[] rs = java.util.Arrays.copyOf(lhs, ((lhs.length) + (rhs.length)));
    java.lang.System.arraycopy(rhs, 0, rs, lhs.length, rhs.length);
    return rs;
}