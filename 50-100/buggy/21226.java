public boolean isDirty() {
    if (!(mLastState.equals(mCurrentState))) {
        if (com.android.systemui.statusbar.policy.SignalController.DEBUG) {
            android.util.Log.d(mTag, (((("Change in state from: " + (mLastState)) + "\n") + "\tto: ") + (mCurrentState)));
        }
        return true;
    }
    return false;
}