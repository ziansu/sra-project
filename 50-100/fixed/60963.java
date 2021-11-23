private void deleteDirectory(java.io.File fileOrDirectory) {
    if (fileOrDirectory.isDirectory()) {
        for (java.io.File child : fileOrDirectory.listFiles()) {
            deleteDirectory(child);
        }
    }
    boolean success = false;
    while (!success) {
        success = fileOrDirectory.delete();
    } 
}