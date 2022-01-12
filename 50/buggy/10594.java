private int getResId(int entryId) {
    return (((this.curPkg.getId()) << 24) | (((this.specId) & 255) << 16)) | (entryId & 65535);
}