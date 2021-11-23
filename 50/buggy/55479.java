public boolean hasChanges() {
    java.nio.file.WatchKey key = service.poll();
    processWatchKey(key);
    return key != null;
}