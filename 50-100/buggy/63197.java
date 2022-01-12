private static byte[] encodeBase64(byte[] data) {
    byte[] base64 = java.util.Base64.getEncoder().encode(data);
    for (int i = 0; i < (base64.length); i++) {
        if ((base64[i]) == '/') {
            base64[i] = '-';
        }
    }
    return data;
}