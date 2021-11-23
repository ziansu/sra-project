@java.lang.Override
public boolean isIdleNow() {
    if (!(mIsIdle)) {
        android.app.Activity currentActivity = getCurrentActivity();
        if ((currentActivity != null) && ((currentActivity.getClass()) != (org.dasfoo.delern.signin.SignInActivity.class))) {
            mIsIdle = true;
            if ((mResourceCallback) != null) {
                mResourceCallback.onTransitionToIdle();
            }
        }
    }
    return mIsIdle;
}