public void changeState(Messages.Message message) {
    try {
        DFA.DFAResponse nextState = DFA.DFAState.getNextState(message, currentState);
        Messages.ControlMessage controlMessage2 = ((Messages.ControlMessage) (nextState.getMessage().body));
        currentState = controlMessage2.type;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}