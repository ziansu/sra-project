public static java.lang.String byteToString(byte[] data, int flag) {
    return android.util.Base64.encodeToString(data, ((android.util.Base64.NO_PADDING) | (android.util.Base64.NO_WRAP)));
}