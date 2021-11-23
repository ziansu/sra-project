private boolean isWakeKeyEnabled(int keyCode) {
    switch (keyCode) {
        case android.view.KeyEvent.KEYCODE_VOLUME_UP :
        case android.view.KeyEvent.KEYCODE_VOLUME_DOWN :
        case android.view.KeyEvent.KEYCODE_VOLUME_MUTE :
            return (mVolumeWakeScreen) || ((mDockMode) != (android.content.Intent.EXTRA_DOCK_STATE_UNDOCKED));
        case android.view.KeyEvent.KEYCODE_BACK :
            return mBackWakeScreen;
        case android.view.KeyEvent.KEYCODE_MENU :
            return mMenuWakeScreen;
        case android.view.KeyEvent.KEYCODE_ASSIST :
            return mAssistWakeScreen;
        case android.view.KeyEvent.KEYCODE_APP_SWITCH :
            return mAppSwitchWakeScreen;
    }
    return true;
}