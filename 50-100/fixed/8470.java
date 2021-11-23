public void deleteRecursive(java.io.File path) {
    java.io.File[] c = path.listFiles();
    if (c == null)
        return ;
    
    for (java.io.File file : c) {
        if (file.isDirectory()) {
            deleteRecursive(file);
            file.delete();
        }else {
            file.delete();
        }
    }
    path.delete();
}