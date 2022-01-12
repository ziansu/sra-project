private static java.lang.String toHex(byte[] byteArray) {
    java.lang.StringBuilder hexString = new java.lang.StringBuilder();
    for (int i = 0; i < (byteArray.length); i++) {
        hexString.append(java.lang.Integer.toHexString((((int) (byteArray[i])) & 255)));
    }
    return hexString.toString();
}