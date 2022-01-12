public void setState(int state) {
    currentState = state;
    gameStates.get(currentState).init();
}