public boolean isDirty() {
    if (com.android.systemui.statusbar.policy.SignalController.DEBUG) {
        android.util.Log.d(mTag, (((("Change in state from: " + (mLastState)) + "\n") + "\tto: ") + (mCurrentState)));
    }
    if (!(mLastState.equals(mCurrentState))) {
        return true;
    }
    return false;
}