@java.lang.Override
protected void on(com.oracle.truffle.api.debug.ExecutionEvent event) {
    executionEvent = event;
    performWork();
}