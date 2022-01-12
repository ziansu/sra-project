public static byte[] combine(byte[] one, byte two) {
    byte[] a = new byte[1];
    a[0] = two;
    if (one == null)
        return a;
    
    byte[] temp = new byte[(one.length) + 1];
    java.lang.System.arraycopy(one, 0, temp, 0, one.length);
    java.lang.System.arraycopy(a, 0, temp, one.length, 1);
    return temp;
}