private void removePhisically(java.lang.String filePath) {
    java.io.File folder = new java.io.File(filePath);
    if (folder.exists()) {
        for (java.io.File f : folder.listFiles()) {
            f.delete();
        }
        folder.delete();
    }
}