private java.lang.String joinByteArray(byte[] bytes, char delimiter) {
    java.lang.StringBuffer byteArrayAsString = new java.lang.StringBuffer();
    byteArrayAsString.append("");
    if (null != bytes) {
        for (int i = 0; i < (bytes.length); i++) {
            byteArrayAsString.append(delimiter).append(bytes[i]);
        }
        if ((byteArrayAsString.length()) > 0) {
            return byteArrayAsString.substring(1);
        }
    }
    return null;
}