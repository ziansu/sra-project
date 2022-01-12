private java.lang.String joinByteArray(byte[] bytes, char delimiter) {
    java.lang.String byteArrayAsString = "";
    if (null != bytes) {
        for (int i = 0; i < (bytes.length); i++) {
            if (i == 0) {
                byteArrayAsString = byteArrayAsString + (bytes[i]);
            }else {
                byteArrayAsString = (byteArrayAsString + delimiter) + (bytes[i]);
            }
        }
    }
    return byteArrayAsString;
}