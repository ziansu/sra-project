protected final void triggerStateCycle(xephyrus.sam.core.StateMachine.StateCycles cycle, S state, P payload, java.lang.Exception error) {
    if (cycle == (xephyrus.sam.core.StateMachine.StateCycles.ERROR)) {
        for (xephyrus.sam.core.StateCycleListener<S, P> listener : _stateCycleListeners) {
            listener.errorStateWork(state, payload, error);
        }
    }else {
        triggerStateCycle(cycle, state, payload);
    }
}