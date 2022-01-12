public static java.util.Map<java.nio.file.Path, com.google.common.hash.HashCode> createHashCodeMap(java.nio.file.Path file) {
    java.util.Map<java.nio.file.Path, com.google.common.hash.HashCode> lastModifiedMap = new java.util.concurrent.ConcurrentHashMap<java.nio.file.Path, com.google.common.hash.HashCode>();
    for (java.nio.file.Path child : io.takari.watcher.PathUtils.recursiveListFiles(file)) {
        com.google.common.hash.HashCode hash = io.takari.watcher.PathUtils.hash(child);
        if (hash != null) {
            lastModifiedMap.put(child, hash);
        }
    }
    return lastModifiedMap;
}