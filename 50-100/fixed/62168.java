private void iterateOnFiles() throws java.io.IOException {
    if (fileIterator.hasNext()) {
        scala.Tuple2<java.lang.String, int[]> tuple2 = fileIterator.next();
        currentFile = tuple2._1;
        currentFilePath = (this.filePath) + (currentFile);
        this.dataInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(currentFilePath), 2097152);
        this.currentDataFileSize = new java.io.File(currentFilePath).length();
    }
}