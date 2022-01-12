java.lang.String extractExtension(java.io.File file) {
    java.lang.String fileName = file.getName();
    int lastDotPosition;
    try {
        lastDotPosition = fileName.lastIndexOf(".");
    } catch (java.lang.IndexOutOfBoundsException e) {
        throw new java.lang.IndexOutOfBoundsException(".が負の値の場合、あるいはこのStringオブジェクトの長さが大きいのでIndexOutOfBoundsExceptionが発生してます");
    }
    if (lastDotPosition > 0) {
        java.lang.String extension = fileName.substring((lastDotPosition + 1));
        return extension;
    }
    return fileName;
}