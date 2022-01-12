@java.lang.Override
public io.opentracing.Span activate(boolean finishOnDeactivate) {
    this.finishOnDeactivate = finishOnDeactivate;
    toRestore = threadLocalActive.get();
    threadLocalActive.set(this);
    return null;
}