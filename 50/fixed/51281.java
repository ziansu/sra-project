private boolean changeState(@de.wackernagel.android.sidekick.widgets.CircularRevealView.State
int newState) {
    if ((state) == newState) {
        return false;
    }
    state = newState;
    if ((stateChangeListener) != null) {
        stateChangeListener.onStateChange(newState);
    }
    return true;
}