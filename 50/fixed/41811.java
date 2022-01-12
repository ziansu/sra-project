public void toggleToolbar(boolean shouldBeVisible) {
    int deltaY = (shouldBeVisible) ? 0 : -(mToolbar.getHeight());
    mToolbar.animate().translationY(deltaY).setInterpolator(new android.view.animation.AccelerateInterpolator(2));
}