private int getResId(int entryId) {
    return (((curPkg.getId()) << 24) | (((specId) & 255) << 16)) | (entryId & 65535);
}