@java.lang.Override
public rx.functions.Action0 onSchedule(rx.functions.Action0 action) {
    if (action instanceof org.springframework.cloud.sleuth.instrument.rxjava.SleuthRxJavaSchedulersHook.WrappedAction0) {
        return action;
    }
    rx.functions.Action0 wrappedAction = ((this.delegate) != null) ? this.delegate.onSchedule(action) : action;
    if (wrappedAction instanceof org.springframework.cloud.sleuth.instrument.rxjava.SleuthRxJavaSchedulersHook.WrappedAction0) {
        return action;
    }
    return super.onSchedule(new org.springframework.cloud.sleuth.instrument.rxjava.SleuthRxJavaSchedulersHook.WrappedAction0(this.tracer, this.traceKeys, wrappedAction));
}