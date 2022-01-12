@java.lang.Override
protected void onVisibilityChanged(android.view.View changedView, int visibility) {
    super.onVisibilityChanged(changedView, visibility);
    if ((changedView == (this)) && (visibility == (VISIBLE))) {
        mLockIcon.update();
        updateCameraVisibility();
        updateLeftButtonVisibility();
        updateCameraIconColor();
        updatePhoneIconColor();
        updateLockIconColor();
        updateIndicationTextColor();
        updateLeftButtonVisibility();
    }
}