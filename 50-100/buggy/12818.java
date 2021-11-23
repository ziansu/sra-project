public static int hash(final java.lang.String str) {
    int hash = -2128831035;
    final byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
    for (final byte b : bytes) {
        {
            int _bitwiseXor = hash ^ b;
            hash = _bitwiseXor;
            hash = hash * 16777619;
        }
    }
    return hash;
}