public static void deleteAll() {
    if ((app.excuseme.util.CacheManager.tmpFileDir) != null) {
        app.excuseme.util.CacheManager.deleteFile(app.excuseme.util.CacheManager.tmpFileDir.toFile());
    }
}