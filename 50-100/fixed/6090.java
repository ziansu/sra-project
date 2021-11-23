private void deleteDirectory(java.io.File path) {
    assert path.isDirectory();
    java.io.File[] files = path.listFiles();
    if (files == null) {
        return ;
    }
    for (java.io.File child : files) {
        if (child.isDirectory()) {
            deleteDirectory(child);
        }else {
            child.delete();
        }
    }
    path.delete();
}