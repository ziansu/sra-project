public void destroy() throws java.io.IOException {
    isReading = false;
    logSender.close();
    if ((bufferedReader) != null) {
        bufferedReader.close();
    }
}