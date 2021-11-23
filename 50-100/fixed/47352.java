@java.lang.Override
public com.brucetoo.videoplayer.IViewTracker attach() {
    if ((mVideoLayerView) == null) {
        mVideoLayerView = new com.brucetoo.videoplayer.VideoLayerView(getDecorView().getContext());
        if ((mVideoLayerView.getParent()) == null) {
            getDecorView().addView(mVideoLayerView, FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
            mFollowerView = mVideoLayerView.cover;
        }
    }
    mIsAttach = true;
    return this;
}