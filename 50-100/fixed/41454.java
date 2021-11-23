private void init(android.content.Context context) {
    iMediaControl = org.song.videoplayer.ConfigManage.getInstance(getContext()).getIMediaControl(this);
    videoView = new android.widget.FrameLayout(context);
    renderViewContainer = new android.widget.FrameLayout(context);
    renderViewContainer.setBackgroundColor(Color.BLACK);
    videoView.addView(renderViewContainer, new org.song.videoplayer.LayoutParams((-1), (-1)));
    addView(videoView, new org.song.videoplayer.LayoutParams((-1), (-1)));
}