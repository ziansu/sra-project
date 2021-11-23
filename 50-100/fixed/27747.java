public static java.lang.String bytesToHexString(byte[] bytes) {
    java.lang.String hex = "";
    for (int i = 0; i < (bytes.length); i++) {
        hex += com.ryan.util.StringUtils.byteToHexString(bytes[i]);
    }
    return hex;
}