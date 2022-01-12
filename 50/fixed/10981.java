public int numTransitionActionsTaken(java.lang.String direction) {
    int numTransitionActions = mActions.get(direction).getLeft();
    return numTransitionActions;
}