public void sortToFile(final java.io.File output) throws java.io.IOException {
    final java.util.List<java.io.File> cacheFiles;
    try (final java.io.BufferedReader bufferedReader = java.nio.file.Files.newBufferedReader(this.file.toPath())) {
        cacheFiles = this.splitFile(bufferedReader, this.file.getCanonicalPath());
    }
    for (final java.io.File file : cacheFiles) {
        this.sortSingleCacheFile(file);
    }
    this.mergeSort(cacheFiles, output, true);
    for (final java.io.File file : cacheFiles) {
    }
}