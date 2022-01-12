public void stopReading() {
    active = false;
    try {
        reader.close();
    } catch (java.io.IOException e) {
        throw new java.lang.IllegalStateException("Error closing input", e);
    } finally {
        try {
            activeExecution.interrupt();
        } catch (java.lang.Throwable ex) {
            throw new java.lang.IllegalStateException("Error stopping input reader thread", ex);
        }
    }
}