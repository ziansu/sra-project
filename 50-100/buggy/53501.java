public <T extends java.lang.Exception> void toThrow(java.lang.Class<T> expectedExceptionClass, java.lang.String expectedMessage) {
    com.mscharhag.oleaster.matcher.util.Arguments.ensureNotNull(expectedMessage, "expectedMessage cannot be null");
    this.toThrow(expectedExceptionClass);
    java.lang.String exceptionMessage = this.exception.getMessage();
    com.mscharhag.oleaster.matcher.util.Expectations.expectTrue(expectedMessage.equals(exceptionMessage), "Expected exception message '%s' but was '%s'", exceptionMessage, exceptionMessage);
}