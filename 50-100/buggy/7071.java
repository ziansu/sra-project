@java.lang.Override
public void start() throws org.mindroid.impl.statemachine.NoStartStateException {
    if ((currentState) == null) {
        if ((startState) == null) {
            throw new org.mindroid.impl.statemachine.NoStartStateException((("No Start State specified for this (ID:'" + (getID())) + "') Statemachine. Use setStartState(..) to specify a State to begin with!"));
        }
        currentState = startState;
        this.isActive = true;
        currentState.activate();
    }
}