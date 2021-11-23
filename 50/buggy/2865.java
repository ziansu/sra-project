private void clear() throws java.io.IOException {
    statsLogWriter.flush();
    csvFileWriter.flush();
    transactionStats.clear();
}