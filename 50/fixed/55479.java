public boolean hasChanges() {
    java.nio.file.WatchKey key = service.poll();
    return processWatchKey(key);
}