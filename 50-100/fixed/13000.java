protected void handleStringAnswer() throws java.io.IOException {
    java.lang.String requestId = readValue();
    java.lang.String value = readValue();
    com.ideal.evecore.util.PendingAtomicReference<java.lang.String> reference = stringResults.remove(requestId);
    if (reference != null) {
        reference.set(value);
    }
}