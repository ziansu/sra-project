public void setAdapter(com.wiky.ui.adapter.PageAdapter adapter) {
    mAdapter = adapter;
    mCurrentFrame.removeAllViews();
    mCurrentFrame.setTag(null);
    mNextFrame.removeAllViews();
    mNextFrame.setTag(null);
    mPrevFrame.removeAllViews();
    mPrevFrame.setTag(null);
    mCurrentPos = 0;
    setDisplayView(mCurrentFrame, 0);
    setDisplayView(mNextFrame, 1);
    setDisplayView(mPrevFrame, (-1));
    setOnTouchListener(this);
}