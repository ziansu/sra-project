public void showAndLock(android.view.animation.Animation.AnimationListener listener) {
    mVisibilityLock = com.android.internal.navigation.fling.FlingLogoController.LOCK_SHOW;
    if (mLogoEnabled) {
        show(listener);
    }
}