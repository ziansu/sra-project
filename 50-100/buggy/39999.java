@java.lang.SuppressWarnings(value = "ThrowableResultOfMethodCallIgnored")
public void expectError(java.lang.Throwable cause, long timeoutMillis) throws java.lang.InterruptedException {
    error.expectCompletion(timeoutMillis, "Did not receive expected error on downstream");
    if (!(error.value().equals(cause))) {
        env.flop(java.lang.String.format("Expected error %s but got %s", cause, error.value()));
    }
}