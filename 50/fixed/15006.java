@org.chromium.base.annotations.CalledByNative
private void onNativeObjectDestroyed() {
    if (((mContentViewCore) != null) && ((mContentViewCore.getBrowserAccessibilityManager()) == (this))) {
        mContentViewCore.setBrowserAccessibilityManager(null);
    }
    mNativeObj = 0;
    mContentViewCore = null;
}