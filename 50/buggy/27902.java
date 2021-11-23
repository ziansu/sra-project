@java.lang.Override
public void fail(java.lang.String failureMessage) {
    fail(new io.vertx.core.impl.NoStackTraceThrowable(failureMessage));
}