@java.lang.Override
protected void onPostExecute(java.lang.Boolean aBoolean) {
    super.onPostExecute(aBoolean);
    mActivity.mDialog.dismiss();
    if (aBoolean) {
        android.support.design.widget.Snackbar.make(mActivity.getCurrentFocus(), "File Uploaded", Snackbar.LENGTH_LONG).setAction("Action", null).show();
        mActivity.loadRootFolder();
    }else {
        mActivity.showToast("File Upload Fail");
    }
}