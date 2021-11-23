@android.support.annotation.CallSuper
protected void onBackground() {
    superCalled = true;
    mActivityState = com.smartdevicelink.api.SdlActivity.SdlActivityState.BACKGROUND;
}