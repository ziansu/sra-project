private void slideTo(float slideOffset) {
    this.slideOffset = slideOffset;
    if (((dragHelper) != null) && (!(belowICS))) {
        dragHelper.smoothSlideViewTo(coverView, coverView.getLeft(), ((computeCoverBottomPosition(slideOffset)) - (coverView.getHeight())));
        dragHelper.smoothSlideViewTo(quickCamera, quickCamera.getLeft(), computeCameraTopPosition(slideOffset));
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
    }else {
        invalidate();
    }
}