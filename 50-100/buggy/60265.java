@org.chromium.base.annotations.CalledByNative
private void presentRequested() {
    mRequestedWebVR = true;
    switch (enterVRIfNecessary()) {
        case org.chromium.chrome.browser.vr_shell.VrShellDelegate.ENTER_VR_NOT_NECESSARY :
            mVrShell.setWebVrModeEnabled(true);
            nativeSetPresentResult(mNativeVrShellDelegate, true);
            mRequestedWebVR = false;
            break;
        case org.chromium.chrome.browser.vr_shell.VrShellDelegate.ENTER_VR_CANCELLED :
            nativeSetPresentResult(mNativeVrShellDelegate, false);
            mRequestedWebVR = false;
            break;
        case org.chromium.chrome.browser.vr_shell.VrShellDelegate.ENTER_VR_REQUESTED :
            break;
        case org.chromium.chrome.browser.vr_shell.VrShellDelegate.ENTER_VR_SUCCEEDED :
            nativeSetPresentResult(mNativeVrShellDelegate, true);
            mRequestedWebVR = false;
            break;
        default :
            org.chromium.base.Log.e(org.chromium.chrome.browser.vr_shell.VrShellDelegate.TAG, "Unexpected enum.");
    }
}