public void processMessage(java.lang.String newString) {
    java.lang.System.out.println(newString);
    fsmBase.setState(State.IDLE);
}