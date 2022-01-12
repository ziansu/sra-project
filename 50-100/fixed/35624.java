private void removeVideoViews() {
    if ((mSinchServiceInterface) == null) {
        return ;
    }
    vc = mSinchServiceInterface.getVideoController();
    if ((vc) != null) {
        android.widget.LinearLayout view = ((android.widget.LinearLayout) (findViewById(R.id.remoteVideo)));
        view.removeView(vc.getRemoteView());
        android.widget.RelativeLayout localView = ((android.widget.RelativeLayout) (findViewById(R.id.localVideo)));
        localView.removeView(vc.getLocalView());
        mVideoViewsAdded = false;
    }
}