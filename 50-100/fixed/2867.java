@java.lang.Override
public java.util.List<com.ovcs.forex.Trade> findAll() {
    try {
        return java.nio.file.Files.list(configuration.getFileStoreDirectoryPath()).map(this::load).collect(java.util.stream.Collectors.toList());
    } catch (java.io.IOException e) {
        throw new java.lang.IllegalStateException("Error finding the trades", e);
    }
}