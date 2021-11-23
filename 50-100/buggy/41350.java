@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public synchronized void onPaletteEvent(com.zomato.photofilters.imageprocessors.Filter filter) {
    mMainTab.select();
    mTabSelectedListener.onTabSelected(mMainTab);
    mHandler.removeCallbacks(mTask);
    mFrameAdapter.setFilter(filter);
    mHistoryAdapter.addHistory();
    mFrameAdapter.apply();
    mPreview.setImageBitmap(mFrameAdapter.getItem(mPreviewIndex).getBitmap());
    mHandler.postDelayed(mTask, mFrameAdapter.getFps());
    mFrameAdapter.clearPreviousFrames();
}