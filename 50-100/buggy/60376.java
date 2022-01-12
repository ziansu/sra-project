private java.lang.String toHexString(byte[] byteArr, int length) {
    java.lang.StringBuffer buff = new java.lang.StringBuffer();
    for (int i = 0; i < length; i++) {
        buff.append(java.lang.String.format("%02X", byteArr[i]));
        if (i < ((responseLength) - 1)) {
            buff.append(":");
        }
    }
    return buff.toString();
}