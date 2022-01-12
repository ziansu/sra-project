public static java.util.List<java.io.File> list(java.io.File file) {
    if (!(file.isDirectory()))
        Homework.indexing.files.add(file);
    
    java.io.File[] children = file.listFiles();
    for (java.io.File child : children) {
        Homework.indexing.list(child);
    }
    return Homework.indexing.files;
}