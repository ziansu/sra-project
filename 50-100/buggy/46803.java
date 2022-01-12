@java.lang.Override
protected void initView(android.view.View view, android.os.Bundle savedInstanceState) {
    mGridView = ((com.github.yuqilin.qmediaplayerapp.gui.view.AutoFitRecyclerView) (view.findViewById(R.id.video_grid)));
    mVideoAdapter = new com.github.yuqilin.qmediaplayerapp.gui.video.VideoListAdapter(this);
    mGridView.setAdapter(mVideoAdapter);
    mVideoLoader = new com.github.yuqilin.qmediaplayerapp.media.VideoLoader(this);
    mHandler.sendEmptyMessage(com.github.yuqilin.qmediaplayerapp.gui.video.VideoFragment.SCAN_START);
}