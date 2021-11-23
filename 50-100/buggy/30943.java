public static short[] intToBytes(int n) {
    short[] bytes = new short[4];
    for (int i = 3; i >= 0; i--) {
        bytes[i] = ((short) (n / ((int) (java.lang.Math.pow(256, i)))));
    }
    return bytes;
}