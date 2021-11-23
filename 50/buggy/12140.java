@java.lang.Override
public io.opentracing.Span activate(boolean finishOnDeactivate) {
    toRestore = threadLocalActive.get();
    threadLocalActive.set(this);
    return null;
}