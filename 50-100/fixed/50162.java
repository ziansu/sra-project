public static java.lang.String subBytesToHex(byte[] bytes, int start, int end) {
    int length = end - start;
    byte[] sub_array = new byte[length];
    for (int i = 0; i < length; i++) {
        sub_array[i] = bytes[(i + start)];
    }
    return com.scanner.bth.bluetoothscanner.BeaconParser.bytesToHex(sub_array);
}