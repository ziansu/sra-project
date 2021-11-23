public static void deleteRecursive(java.io.File fileOrDirectory) {
    if (fileOrDirectory.isDirectory())
        for (java.io.File child : fileOrDirectory.listFiles()) {
            boolean status = child.delete();
        }
    
}