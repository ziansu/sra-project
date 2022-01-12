public void requiredMessageOf(java.lang.String property, java.lang.Class<? extends java.lang.annotation.Annotation> annotationType) {
    if (property == null) {
        throw new java.lang.IllegalArgumentException("The argument 'property' should not be null.");
    }
    if (annotationType == null) {
        throw new java.lang.IllegalArgumentException("The argument 'annotationType' should not be null.");
    }
    final java.lang.String messageKey = toDefinedMessageKey(annotationType);
    final org.lastaflute.core.message.UserMessages messages = _cause.getMessages();
    org.junit.Assert.assertTrue(("No validation error for the message: " + annotationType), hasMessageOf(messages, property, messageKey));
}