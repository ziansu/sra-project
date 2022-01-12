public void showProgress(java.lang.String msg, boolean cancelable, boolean outsideCancelAble) {
    if ((mProgress) == null) {
        mProgress = new android.app.ProgressDialog(mContext);
        mProgress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgress.setTitle("提示");
    }
    mProgress.setCancelable(cancelable);
    mProgress.setCanceledOnTouchOutside(outsideCancelAble);
    mProgress.setMessage(msg);
    mProgress.show();
}