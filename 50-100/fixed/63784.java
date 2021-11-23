private void startLoad() {
    if (!(mHasFrame)) {
        return ;
    }
    if ((!(mIsAttach)) || (!(mIsVisible))) {
        return ;
    }
    com.baidu.iknow.imageloader.request.ImageLoader.getInstance().load(mUrl, mDrawableWrapper.mViewWidth, mDrawableWrapper.mViewHeight, this, isFastScroll());
    requestLayout();
    invalidate();
}