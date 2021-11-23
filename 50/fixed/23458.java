public synchronized void event() {
    if (!(ifExpected)) {
        anyUnexpected = true;
        fail("Unexpected event");
    }
    ifExpected = false;
}