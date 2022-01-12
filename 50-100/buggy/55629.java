@java.lang.Override
public java.lang.String getMessage() {
    java.lang.StringBuilder messages = new java.lang.StringBuilder();
    for (java.lang.Throwable exception = exceptions.peek(); exception != null; exception = exceptions.peek()) {
        if ((messages.length()) != 0) {
            messages.append('\n');
        }
        java.lang.String message = exception.getMessage();
        messages.append((message == null ? exception.toString() : message));
    }
    return messages.toString();
}