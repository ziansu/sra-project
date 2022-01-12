public static java.lang.String bytesToHexString(byte[] bytes) {
    java.lang.String hex = "";
    java.lang.System.out.println(bytes.length);
    for (int i = 0; i < (bytes.length); i++) {
        java.lang.System.out.print(((com.ryan.util.StringUtils.byteToHexString(bytes[i])) + ":"));
        hex += com.ryan.util.StringUtils.byteToHexString(bytes[i]);
    }
    return hex;
}