public int getPacketSize(byte[] toTrim) {
    byte[] trimmed = java.util.Arrays.copyOfRange(toTrim, 6, toTrim.length);
    java.lang.String size = "";
    for (byte b : trimmed) {
        if (b != 12) {
            size = size.concat(java.lang.String.valueOf(b));
        }else {
            break;
        }
    }
    return java.lang.Integer.valueOf(size);
}