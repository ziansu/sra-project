@java.lang.Override
public void onGlobalLayout() {
    if ((mScreenChangedListener) != null) {
        getWindowVisibleDisplayFrame(mWindowRect);
        mScreenChangedListener.onScreenChanged(mWindowRect, mLastUiVisibility);
    }
}