private com.backend.PicStatus getFileStatus(java.lang.String value) {
    if ("true".equalsIgnoreCase(value)) {
        return com.backend.PicStatus.EXIST;
    }
    if ("false".equalsIgnoreCase(value)) {
        return com.backend.PicStatus.HIDDEN;
    }
    return com.backend.PicStatus.valueOf(value);
}