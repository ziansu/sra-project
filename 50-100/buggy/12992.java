public io.kks.states.State removeState(int index) {
    if (((stateStack.size()) <= 1) || (outOfBounds(index))) {
        return null;
    }
    io.kks.states.State removeState = stateStack.remove(index);
    removeState.onDestroy();
    return removeState;
}