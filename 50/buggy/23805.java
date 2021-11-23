@java.lang.Override
protected void onProgressUpdate(java.lang.Integer... values) {
    super.onProgressUpdate(values);
    mListener.onShowProgressDialog(mTitle, mMessage);
}