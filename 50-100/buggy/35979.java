@java.lang.Override
public rx.functions.Action0 onSchedule(rx.functions.Action0 action) {
    rx.functions.Action0 wrappedAction = ((this.delegate) != null) ? this.delegate.onSchedule(action) : action;
    return super.onSchedule(new org.springframework.cloud.sleuth.instrument.rxjava.SleuthRxJavaSchedulersHook.WrappedAction0(this.tracer, this.traceKeys, wrappedAction));
}