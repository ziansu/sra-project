private static boolean isValidFileStore(java.lang.String path) {
    java.io.File store = new java.io.File(path);
    if ((store == null) || (!(store.isDirectory()))) {
        return false;
    }
    for (java.lang.String f : store.list()) {
        if ("journal.log".equals(f)) {
            return true;
        }
    }
    return false;
}