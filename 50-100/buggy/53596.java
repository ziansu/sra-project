public <T extends com.bortbort.arduino.FiloFirmata.Message> T sendMessageSynchronous(java.lang.Class<T> responseType, com.bortbort.arduino.FiloFirmata.TransmittableMessage message) {
    T responseMessage = null;
    com.bortbort.arduino.FiloFirmata.SynchronousMessageListener messageListener = new com.bortbort.arduino.FiloFirmata.SynchronousMessageListener(responseType);
    addMessageListener(messageListener);
    if (sendMessage(message)) {
        if (messageListener.waitForResponse()) {
            responseMessage = responseType.cast(messageListener.getResponseMessage());
        }
    }
    removeMessageListener(messageListener);
    return responseMessage;
}