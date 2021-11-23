@java.lang.Override
public void dispatch(net.jmeze.jredux.Action action) {
    if (net.jmeze.jredux.BaseStore.isDispatching.get()) {
        throw new java.lang.IllegalStateException("Reducers may not dispatch actions");
    }
    S state;
    synchronized(this) {
        net.jmeze.jredux.BaseStore.isDispatching.set(true);
        currentState = reducer.reduce(currentState, action);
        net.jmeze.jredux.BaseStore.isDispatching.set(false);
        state = currentState;
    }
    for (net.jmeze.jredux.Subscriber subscriber : subscribers) {
        subscriber.onStateChange(state);
    }
}