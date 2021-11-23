protected void handleBooleanAnswer() throws java.io.IOException {
    java.lang.String requestId = readValue();
    boolean value = readTest();
    com.ideal.evecore.util.PendingAtomicReference<java.lang.Boolean> reference = booleanResults.remove(requestId);
    if (reference != null) {
        reference.set(value);
    }
}