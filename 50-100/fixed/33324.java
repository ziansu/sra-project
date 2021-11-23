public cn.jesse.nativelogger.NLogger.Builder fileDirectory(java.lang.String path) {
    if (android.text.TextUtils.isEmpty(path))
        throw new java.lang.IllegalArgumentException("unexpected path");
    
    java.io.File filePath = new java.io.File(path);
    if ((!(filePath.exists())) && (!(filePath.mkdirs())))
        cn.jesse.nativelogger.NLogger.getInstance().defaultLogger.error(tag, "can not make dir, please check permission");
    
    this.fileDirectory = path;
    return this;
}