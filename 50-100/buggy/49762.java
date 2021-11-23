private void onUnExpanded() {
    android.util.Log.e(com.junhzhan.cal.widget.CalendarWidgetNew.TAG, "onUnExpanded");
    mExtraNeedLayout = true;
    mHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mAdapter.setWeekView();
        }
    });
    mHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mList.adjustHeight(true);
        }
    });
}