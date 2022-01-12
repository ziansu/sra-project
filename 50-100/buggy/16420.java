public void smoothClose(boolean smooth) {
    if ((mStatus) != (cn.bleu.widget.slidedetails.SlideDetailsLayout.Status.CLOSE)) {
        mStatus = cn.bleu.widget.slidedetails.SlideDetailsLayout.Status.OPEN;
        final float height = -(getMeasuredHeight());
        animatorSwitch(height, 0, true, (smooth ? mDuration : 0));
    }
}