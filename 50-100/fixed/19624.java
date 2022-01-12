public static io.minio.ErrorCode fromString(java.lang.String codeString) {
    if (codeString == null) {
        return null;
    }
    for (io.minio.ErrorCode ec : io.minio.ErrorCode.values()) {
        if (codeString.equals(ec.code)) {
            return ec;
        }
    }
    return null;
}