public synchronized void event() {
    if (!(ifExpected)) {
        anyUnexpected = true;
        throw new java.lang.RuntimeException("Unexpected event");
    }
    ifExpected = false;
}