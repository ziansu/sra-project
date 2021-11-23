public java.io.File getDataDir(java.lang.String md5hash) {
    if (md5hash == null) {
        return null;
    }
    return new java.io.File(mIndexDir, (((mDataPath) + "/") + md5hash));
}