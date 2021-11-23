public void assertNoTerminalEvent() {
    if (((onCompleteEvents.size()) > 0) || ((onErrorEvents.size()) > 0)) {
        throw new java.lang.AssertionError("Terminal events received.");
    }
}