@java.lang.Override
protected void onResume() {
    super.onResume();
    isResumed = true;
    dialogHandler.resume();
    setFullscreenIfEnable();
    mToolbar.resetToolBar();
    jp.hazuki.yuzubrowser.utils.PermissionUtils.checkFirst(this);
}