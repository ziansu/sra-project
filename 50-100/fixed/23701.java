public static byte[] concatenate(byte[] x, byte y) {
    byte[] ret = new byte[(x.length) + 1];
    java.lang.System.arraycopy(x, 0, ret, 0, x.length);
    ret[x.length] = y;
    return ret;
}