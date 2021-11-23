public void setAdapter(com.wiky.ui.adapter.PageAdapter adapter) {
    mAdapter = adapter;
    mCurrentFrame.removeAllViews();
    mNextFrame.removeAllViews();
    mPrevFrame.removeAllViews();
    mCurrentPos = 0;
    setDisplayView(mCurrentFrame, 0);
    setDisplayView(mNextFrame, 1);
    setDisplayView(mPrevFrame, (-1));
    setOnTouchListener(this);
}