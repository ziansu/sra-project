@java.lang.Override
public boolean fail(java.lang.String failureMessage) {
    return fail(new io.vertx.core.impl.NoStackTraceThrowable(failureMessage));
}