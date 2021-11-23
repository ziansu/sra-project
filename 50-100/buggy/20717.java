private void removePhisically(java.lang.String path) {
    java.io.File folder = new java.io.File(path);
    if (folder.exists()) {
        for (java.io.File f : folder.listFiles()) {
            f.delete();
        }
        folder.delete();
    }
}