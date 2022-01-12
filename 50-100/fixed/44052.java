public boolean onKeyMultiple(int keyCode, int repeatCount, android.view.KeyEvent event) {
    boolean ret = super.onKeyMultiple(keyCode, repeatCount, event);
    if ((mPluginActivity) != null) {
        mPluginActivity.onKeyMultiple(keyCode, repeatCount, event);
    }
    return ret;
}