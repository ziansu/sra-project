public void setState(gui.state.State newState) {
    currentState = newState;
    newState.setPage(this);
}