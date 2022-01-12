private synchronized void setState(org.apache.kafka.streams.processor.internals.StreamThread.State newState) {
    org.apache.kafka.streams.processor.internals.StreamThread.State oldState = state;
    if (!(state.isValidTransition(newState))) {
        throw new java.lang.IllegalStateException(((("Incorrect state transition from " + (state)) + " to ") + newState));
    }
    state = newState;
    if ((stateListener) != null) {
        stateListener.onChange(this, state, oldState);
    }
}