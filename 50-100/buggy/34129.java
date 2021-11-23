public void requiredMessageOf(java.lang.String property, java.lang.String messageKey) {
    if (property != null) {
        throw new java.lang.IllegalArgumentException("The argument 'property' should not be null.");
    }
    if (messageKey != null) {
        throw new java.lang.IllegalArgumentException("The argument 'messageKey' should not be null.");
    }
    final org.lastaflute.core.message.UserMessages messages = _cause.getMessages();
    org.junit.Assert.assertTrue(("No validation error for the message: " + messageKey), hasMessageOf(messages, property, messageKey));
}