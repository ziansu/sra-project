@java.lang.Override
protected void onVisibilityChanged(android.view.View changedView, int visibility) {
    super.onVisibilityChanged(changedView, visibility);
    if (isShown()) {
        mTrustDrawable.start();
    }else {
        mTrustDrawable.stop();
        requestVisualizer(false, 0);
    }
    if ((changedView == (this)) && (visibility == (VISIBLE))) {
        mLockIcon.update();
        updateCameraVisibility();
    }
}