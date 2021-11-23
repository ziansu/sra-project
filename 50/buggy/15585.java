public void destroy() throws java.io.IOException {
    isReading = false;
    logSender.close();
    bufferedReader.close();
}