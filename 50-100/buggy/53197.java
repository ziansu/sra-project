boolean smoothSlideTo(float slideOffset, int velocity) {
    if (!(isEnabled())) {
        return false;
    }
    int panelTop = computePanelTopPosition(slideOffset);
    if (mDragHelper.smoothSlideViewTo(mSlideableView, mSlideableView.getLeft(), panelTop)) {
        setAllChildrenVisible();
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }
    return false;
}