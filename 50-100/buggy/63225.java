private java.util.List<java.nio.file.Path> findCreatedFiles(java.util.Set<java.nio.file.Path> filesOnDisk) {
    java.util.List<java.nio.file.Path> createdFileList = new java.util.ArrayList<java.nio.file.Path>();
    for (java.nio.file.Path file : filesOnDisk) {
        if (!(hashCodeMap.containsKey(file))) {
            com.google.common.hash.HashCode hashCode = io.takari.watcher.PathUtils.hash(file);
            createdFileList.add(file);
            hashCodeMap.put(file, hashCode);
        }
    }
    return createdFileList;
}