public void unlockAndHide(android.view.animation.Animation.AnimationListener listener) {
    mVisibilityLock = com.android.internal.navigation.fling.FlingLogoController.LOCK_DISABLED;
    if (mLogoEnabled) {
        hide(listener);
    }
}