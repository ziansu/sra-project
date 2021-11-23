public static java.io.File getFile(java.lang.String key) {
    java.io.File fileCache = new java.io.File(info.rajeshr.quickstart.Libraries.PaperDB.getPaperDbFolder(), (((java.io.File.separator) + ".") + key));
    info.rajeshr.quickstart.Helpers.FileHelper.createFile(fileCache);
    return fileCache;
}