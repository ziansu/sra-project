public java.io.File getDataDir(java.lang.String md5hash) {
    return new java.io.File(mIndexDir, (((mDataPath) + "/") + md5hash));
}