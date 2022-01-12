private void moveToNextQueue(java.nio.file.Path file) throws java.lang.InterruptedException {
    directoryQueue.put(file);
    ru.shishmakov.core.DirectoryFileWatcher.logger.debug("--> put file \'{}\' : directoryQueue", file.getFileName());
}