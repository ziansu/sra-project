public <T> T call(java.util.concurrent.Callable<T> callable) throws java.lang.Exception {
    voices = captureVoices();
    boolean failure = true;
    try {
        T result = callable.call();
        failure = false;
        return result;
    } finally {
        releaseVoices(voices, failure);
    }
}