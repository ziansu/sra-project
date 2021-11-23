@java.lang.Override
public void run() {
    lock.readLock().lock();
    try {
        rocks.nifi.examples.StandardPropertiesFileService.log.info("Check file watcher");
        if (fileWatcher.checkAndReset()) {
            rocks.nifi.examples.StandardPropertiesFileService.log.error("I found a change?");
            loadPropertiesFiles();
        }
    } catch (java.io.IOException e) {
        rocks.nifi.examples.StandardPropertiesFileService.log.error("Failed to check file watcher!", e);
    } finally {
        lock.readLock().unlock();
    }
}