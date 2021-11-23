public static byte[] toBigEndian(byte[] value) {
    for (int i = 0, length = (value.length) >> 1; i < length; i++) {
        final int j = ((value.length) - 1) - i;
        final byte t = value[i];
        value[i] = value[j];
        value[j] = t;
    }
    return value;
}