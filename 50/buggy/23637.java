@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if ((end > 0) && ((mOnPushLoadMoreListener) != null)) {
        mOnPushLoadMoreListener.onLoadMore();
        mLoadMore = true;
    }else {
        mLoadMore = false;
    }
}