public static boolean[] append(boolean[] lhs, boolean[] rhs) {
    boolean[] rs = java.util.Arrays.copyOf(lhs, ((lhs.length) + (rhs.length)));
    java.lang.System.arraycopy(rhs, 0, rs, lhs.length, rhs.length);
    return rs;
}