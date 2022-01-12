private void fileModified(java.nio.file.Path path) throws java.io.IOException {
    org.apache.flume.source.taildirectory.WatchDir.LOGGER.trace("WatchDir: fileModified");
    org.apache.flume.source.taildirectory.FileSet fileSet = fileSetMap.getFileSet(path);
    if (!(fileSet.isFileIsOpen()))
        fileSet.open();
    
    readLines(fileSet);
}