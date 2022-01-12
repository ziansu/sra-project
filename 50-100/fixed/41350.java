@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public synchronized void onPaletteEvent(com.zomato.photofilters.imageprocessors.Filter filter) {
    mHandler.removeCallbacks(mTask);
    mHistoryAdapter.addHistory();
    mFrameAdapter.apply();
    mFrameAdapter.setFilter(filter);
    mHistoryAdapter.addHistory();
    mFrameAdapter.apply();
    mPreview.setImageBitmap(mFrameAdapter.getItem(mPreviewIndex).getBitmap());
    mHandler.postDelayed(mTask, mFrameAdapter.getFps());
    mFrameAdapter.clearPreviousFrames();
    mMainTab.select();
    mTabSelectedListener.onTabSelected(mMainTab);
}