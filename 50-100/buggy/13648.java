private void hideActionBarIfNeeded() {
    android.support.v7.app.ActionBar actionBar = getActionBar();
    if ((((((getActionBar()) != null) && (!(isHardwareKeyboardPresent()))) && (mHideActionBarOnSoftKeyboardUp)) && (mIsKeyboardOpen)) && (actionBar.isShowing())) {
        getActionBar().hide();
    }
}