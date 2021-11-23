public static int byteArrayToInt(byte[] bytes) {
    return nl.dobots.bluenet.utils.BleUtils.byteArrayToShort(bytes, 0);
}