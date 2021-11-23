public static byte[] combine(byte[] one, byte two) {
    byte[] a = new byte[two];
    if (one == null)
        return a;
    
    byte[] temp = new byte[(one.length) + (a.length)];
    java.lang.System.arraycopy(one, 0, temp, 0, one.length);
    java.lang.System.arraycopy(a, 0, temp, one.length, a.length);
    return temp;
}