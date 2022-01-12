@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if ((end > 0) && ((mOnPushLoadMoreListener) != null)) {
        mLoadMore = true;
        mOnPushLoadMoreListener.onLoadMore();
    }else {
        mLoadMore = false;
    }
}