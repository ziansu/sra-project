@java.lang.Override
public void onAnimationEnd(android.support.v4.animation.ValueAnimatorCompat animation) {
    super.onAnimationEnd(animation);
    if (this.mOverridden) {
        return ;
    }
    if (swipeDir <= 0) {
        mCallback.clearView(mRecyclerView, prevSelected);
    }else {
        mPendingCleanup.add(prevSelected.itemView);
        mIsPendingCleanup = true;
        if (swipeDir > 0) {
            postDispatchSwipe(this, swipeDir);
        }
    }
    if ((mOverdrawChild) == (prevSelected.itemView)) {
        removeChildDrawingOrderCallbackIfNecessary(prevSelected.itemView);
    }
}