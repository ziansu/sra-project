private java.lang.Integer getOrientationId() {
    init();
    return (mExifDir) == null ? null : mExifDir.getInteger(ExifDirectoryBase.TAG_ORIENTATION);
}