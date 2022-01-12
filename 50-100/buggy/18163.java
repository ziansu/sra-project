public void setActiveState(boolean active) {
    if ((mLogicalState) == (com.anysoftkeyboard.utils.ModifierKeyState.LOCKED))
        return ;
    
    mLogicalState = (active) ? com.anysoftkeyboard.utils.ModifierKeyState.ACTIVE : com.anysoftkeyboard.utils.ModifierKeyState.INACTIVE;
    if ((mLogicalState) == (com.anysoftkeyboard.utils.ModifierKeyState.ACTIVE)) {
        mActiveStateStartTime = android.os.SystemClock.elapsedRealtime();
        mConsumed = false;
    }
}