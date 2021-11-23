private void register(java.nio.file.Path dir) throws java.io.IOException {
    java.nio.file.WatchKey key = dir.register(watcher, java.nio.file.StandardWatchEventKinds.ENTRY_CREATE, java.nio.file.StandardWatchEventKinds.ENTRY_DELETE, java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY);
    if (trace) {
        java.nio.file.Path prev = keys.get(key);
        if (prev == null) {
            java.lang.System.out.format("register: %s\n", dir);
        }else {
            if (!(dir.equals(prev))) {
                java.lang.System.out.format("update: %s -> %s\n", prev, dir);
            }
        }
    }
    keys.put(key, dir);
}