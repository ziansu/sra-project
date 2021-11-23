public void unlockAndShow(android.view.animation.Animation.AnimationListener listener) {
    mVisibilityLock = com.android.internal.navigation.fling.FlingLogoController.LOCK_DISABLED;
    if (mLogoEnabled) {
        show(listener);
    }
}