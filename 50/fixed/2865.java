private void clear() throws java.io.IOException {
    if ((statsLogWriter) != null) {
        statsLogWriter.flush();
    }
    if ((csvFileWriter) != null) {
        csvFileWriter.flush();
    }
    transactionStats.clear();
}