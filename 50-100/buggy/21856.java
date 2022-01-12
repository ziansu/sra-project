@java.lang.Override
public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
    if (((keyCode == (android.view.KeyEvent.KEYCODE_MENU)) && ((mReactInstanceManager) != null)) && (BuildConfig.DEBUG)) {
        mReactInstanceManager.showDevOptionsDialog();
        return true;
    }
    return super.onKeyUp(keyCode, event);
}