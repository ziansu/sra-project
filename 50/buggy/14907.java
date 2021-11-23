private void startReaders() throws java.io.FileNotFoundException {
    this.streamReader = new com.inaetics.demonstrator.logging.LogCatReader.LogcatProcessStreamReader(this.inStd, logcatOut);
    this.errStreamReader = new com.inaetics.demonstrator.logging.LogCatReader.LogcatProcessStreamReader(this.inErr, null);
    streamReader.start();
    errStreamReader.start();
}