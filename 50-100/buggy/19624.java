public static io.minio.ErrorCode fromString(java.lang.String codeString) {
    if (codeString == null) {
        throw new java.lang.IllegalArgumentException("null code string");
    }
    for (io.minio.ErrorCode ec : io.minio.ErrorCode.values()) {
        if (codeString.equals(ec.code)) {
            return ec;
        }
    }
    throw new java.lang.IllegalArgumentException((("invalid error code string '" + codeString) + "'"));
}