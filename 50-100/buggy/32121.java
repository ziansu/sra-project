@java.lang.Override
public java.util.List<com.ovcs.forex.Trade> findAllClosed() {
    try {
        return java.nio.file.Files.walk(configuration.getFileStoreDirectoryPath()).filter(( path) -> path.endsWith(".json")).map(this::load).filter(Trade::isClosed).collect(java.util.stream.Collectors.toList());
    } catch (java.io.IOException e) {
        throw new java.lang.IllegalStateException("Error finding the trades", e);
    }
}