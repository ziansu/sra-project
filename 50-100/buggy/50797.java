protected boolean deleteIfExists(java.io.File file) {
    if (file.exists()) {
        if (file.isDirectory()) {
            java.io.File[] files = file.listFiles();
            for (java.io.File nestedFile : files) {
                if (!(deleteIfExists(nestedFile))) {
                    return false;
                }
            }
        }
        return file.delete();
    }
    return true;
}