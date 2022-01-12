public static boolean isPureAscii(byte[] data) {
    if (data == null) {
        return false;
    }
    for (byte b : data) {
        if ((b > ((byte) (127))) || (b < 32)) {
            return false;
        }
    }
    return true;
}