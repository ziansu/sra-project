@java.lang.Override
public void onSystemUiVisibilityChange(int visibility) {
    mLastUiVisibility = visibility;
    if ((mScreenChangedListener) != null) {
        getWindowVisibleDisplayFrame(mWindowRect);
        mScreenChangedListener.onScreenChanged(mWindowRect, visibility);
    }
}