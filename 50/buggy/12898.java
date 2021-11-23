public static java.lang.String bytesToString(byte[] bytes) {
    if (bytes != null) {
        return new java.lang.String(bytes, java.nio.charset.Charset.forName("UTF-8"));
    }else {
        return new java.lang.String("");
    }
}