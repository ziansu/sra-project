public java.lang.Object getLastMessage() {
    synchronized(lock) {
        waitForMessage();
        org.junit.Assert.assertFalse(messages.isEmpty());
        return messages.get(0);
    }
}