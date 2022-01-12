void notifyException(java.lang.Exception exception) {
    this.exception = exception;
    if ((testThread) != null) {
        testThread.interrupt();
    }
}