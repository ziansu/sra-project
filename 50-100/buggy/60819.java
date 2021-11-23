public void set(java.lang.Integer stateName) {
    if (!(states.containsKey(stateName))) {
        throw new se.chalmers.get_rect.states.StateNotFoundException(("Could not find a state with ID:" + stateName));
    }
    java.lang.Integer oldState = currentState;
    if (oldState != null) {
        getState().leavingState(oldState);
    }
    currentState = stateName;
    getState().enteringState(oldState);
}