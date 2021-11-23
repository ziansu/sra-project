@java.lang.Override
protected void onPostExecute(java.lang.Boolean aBoolean) {
    super.onPostExecute(aBoolean);
    mActivity.mDialog.dismiss();
    if (aBoolean) {
        mActivity.showToast("File Uploaded");
        mActivity.loadRootFolder();
    }else {
        mActivity.showToast("File Upload Fail");
    }
}