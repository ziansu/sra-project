@java.lang.Override
protected void initView(android.view.View view, android.os.Bundle savedInstanceState) {
    mVideoLoader = new com.github.yuqilin.qmediaplayerapp.media.VideoLoader(this);
    mGridView = ((com.github.yuqilin.qmediaplayerapp.gui.view.AutoFitRecyclerView) (view.findViewById(R.id.video_grid)));
    mVideoAdapter = new com.github.yuqilin.qmediaplayerapp.gui.video.VideoListAdapter(this);
    mGridView.setAdapter(mVideoAdapter);
    mHandler.sendEmptyMessage(com.github.yuqilin.qmediaplayerapp.gui.video.VideoFragment.SCAN_START);
}