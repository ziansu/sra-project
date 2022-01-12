@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    mInitHeight = mTableBody.getMeasuredHeight();
    if (mIsWaitingForUpdate) {
        highlight();
        mHandler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                collapseTo(mCurrentWeekIndex);
            }
        });
        mIsWaitingForUpdate = false;
        if ((mListener) != null) {
            mListener.onDataUpdate();
        }
    }
}