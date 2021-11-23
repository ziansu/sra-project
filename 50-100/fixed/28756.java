public static byte[] concatenate(byte x, byte[] y) {
    byte[] ret = new byte[(y.length) + 1];
    ret[0] = x;
    java.lang.System.arraycopy(y, 0, ret, 1, y.length);
    return ret;
}