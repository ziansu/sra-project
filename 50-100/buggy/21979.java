protected void handleObjectAnswer() throws java.io.IOException {
    java.lang.String requestId = readValue();
    java.lang.String json = readValue();
    com.ideal.evecore.util.PendingAtomicReference<java.lang.String> reference = objectResults.remove(requestId);
    if (reference != null) {
        synchronized(reference) {
            reference.set(json);
            reference.notify();
        }
    }
}