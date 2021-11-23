public static byte[] concatenate(byte[] x, byte y) {
    byte[] ret = new byte[(x.length) + 1];
    java.lang.System.arraycopy(x, 0, ret, 0, x.length);
    java.lang.System.arraycopy(y, 0, ret, x.length, 1);
    return ret;
}