public java.lang.String getErrorTextFromException(java.lang.Throwable t) {
    java.lang.String message = t.getMessage();
    if (message == null) {
        message = "(No exception message available)";
        log.error(message, t);
    }
    return message;
}