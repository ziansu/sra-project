@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    int topMargin = headerLayoutParams.topMargin;
    while (true) {
        if (0 == topMargin) {
            publishProgress(topMargin);
            break;
        }
        topMargin = topMargin + (com.fionera.wechatdemo.view.RefreshableView.SCROLL_SPEED);
        if (topMargin < 0) {
            topMargin = 0;
        }
        publishProgress(topMargin);
    } 
    currentStatus = com.fionera.wechatdemo.view.RefreshableView.STATUS_REFRESHING;
    if ((mListener) != null) {
        java.lang.String data = "Hello world";
        mListener.onRefresh(data);
    }
    return null;
}