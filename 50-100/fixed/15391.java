public static void initFileSystem() {
    java.io.File root = new java.io.File(com.teamshi.collectionsystem3.IOManager.APP_ROOT);
    if (!(root.exists())) {
        root.mkdirs();
    }
    java.io.File dateDir = new java.io.File(com.teamshi.collectionsystem3.IOManager.APP_ROOT_DATA);
    if (!(dateDir.exists())) {
        dateDir.mkdirs();
    }
}