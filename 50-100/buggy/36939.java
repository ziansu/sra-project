public void onHideCustomView() {
    android.app.Activity activity = mXWalkView.getActivity();
    if (((mCustomXWalkView) == null) || (activity == null))
        return ;
    
    if ((mContentsClient) != null) {
        mContentsClient.onToggleFullscreen(true);
    }
    android.widget.FrameLayout decor = ((android.widget.FrameLayout) (activity.getWindow().getDecorView()));
    decor.removeView(mCustomXWalkView);
    mCustomViewCallback.onCustomViewHidden();
    mCustomXWalkView = null;
    mCustomViewCallback = null;
}