@java.lang.Override
public void update() {
    if ((newEnabledState) != (mPersistedState)) {
        mPersistedState = newEnabledState;
        refreshState();
    }
}