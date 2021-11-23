public com.hobbes.wstore.FileByteChanges insert(com.hobbes.wstore.Path dataFile, com.hobbes.wstore.Path logFile) throws java.io.IOException {
    com.hobbes.wstore.FileByteChanges fbc = new com.hobbes.wstore.FileByteChanges(fileSystem, dataFile, logFile);
    if ((table.size()) == (size)) {
        evict();
    }
    table.put(dataFile, fbc);
    lru[currIndex] = dataFile;
    currIndex = ((currIndex) + 1) % (size);
    return fbc;
}