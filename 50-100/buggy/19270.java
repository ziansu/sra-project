public com.hobbes.wstore.FileByteChanges insert(com.hobbes.wstore.Path dataFile, com.hobbes.wstore.Path logFile) {
    com.hobbes.wstore.FileByteChanges fbc = new com.hobbes.wstore.FileByteChangesDeque(fileSystem, dataFile, logFile);
    if ((t.size()) == (size)) {
        evict();
    }
    table.put(dataFile, fbc);
    lru[currIndex] = dataFile;
    currIndex = ((currIndex) + 1) % (size);
    return fbc;
}