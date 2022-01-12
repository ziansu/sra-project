private void callHandlers(org.springframework.statemachine.state.State<S, E> sourceState, org.springframework.statemachine.state.State<S, E> targetState, org.springframework.messaging.Message<E> message) {
    if ((sourceState != null) && (targetState != null)) {
        org.springframework.statemachine.StateContext<S, E> stateContext = buildStateContext(message, null, this);
        getStateMachineHandlerResults(getStateMachineHandlers(sourceState, targetState), stateContext);
    }
}