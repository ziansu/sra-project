@java.lang.Override
public void run() {
    try {
        rocks.nifi.examples.StandardPropertiesFileService.log.info("Check file watcher");
        if (fileWatcher.checkAndReset()) {
            rocks.nifi.examples.StandardPropertiesFileService.log.error("I found a change?");
            loadPropertiesFiles();
        }
    } catch (java.io.IOException e) {
        rocks.nifi.examples.StandardPropertiesFileService.log.error("Failed to check file watcher!", e);
    }
}