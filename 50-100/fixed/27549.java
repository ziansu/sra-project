public static int toInt(byte[] arr) {
    int result = 0;
    byte bLoop;
    for (int i = 0; i < (arr.length); i++) {
        bLoop = arr[(((arr.length) - 1) - i)];
        result += (bLoop & 255) << (8 * i);
    }
    return result;
}