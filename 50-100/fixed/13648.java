private void hideActionBarIfNeeded() {
    android.support.v7.app.ActionBar actionBar = getActionBar();
    if (((((actionBar != null) && (!(isHardwareKeyboardPresent()))) && (mHideActionBarOnSoftKeyboardUp)) && (mIsKeyboardOpen)) && (actionBar.isShowing())) {
        getActionBar().hide();
    }
}