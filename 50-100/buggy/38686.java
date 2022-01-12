@java.lang.Override
public void onAuthenticationSucceeded(android.support.v4.hardware.fingerprint.FingerprintManagerCompat.AuthenticationResult result) {
    de.Maxr1998.xposed.maxlock.util.Util.hideKeyboardFromWindow(((android.app.Activity) (mLockView.getContext())), this);
    if (mLockView.allowFingerprint()) {
        handleFingerprintIndicator(R.drawable.lockscreen_fingerprint_draw_off_animation);
        mLockView.handleAuthenticationSuccess();
    }else {
        onWindowFocusChanged(true);
    }
}