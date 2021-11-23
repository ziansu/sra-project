protected void initiateSendIfNecessary() {
    boolean sending = isSending.get();
    if (!(isSending.getAndSet(true))) {
        sendBytesFromBuffer();
    }
}