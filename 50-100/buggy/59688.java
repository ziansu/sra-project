public <T> T await(java.lang.Class<T> class1) throws java.io.IOException, java.lang.InterruptedException {
    com.cardshifter.api.messages.Message message = messages.take();
    if (message instanceof com.cardshifter.api.outgoing.ServerErrorMessage) {
        org.junit.Assert.fail(message.toString());
    }
    if (!(class1.isAssignableFrom(message.getClass()))) {
        org.junit.Assert.fail(((("Expected " + class1) + " but was ") + message));
    }
    return class1.cast(message);
}