private static <T> T[] append(T[] lhs, T[] rhs) {
    T[] rs = java.util.Arrays.copyOf(lhs, ((lhs.length) + (rhs.length)));
    java.lang.System.arraycopy(rhs, 0, rs, lhs.length, rhs.length);
    return rs;
}