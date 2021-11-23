@java.lang.Override
protected void onProgressUpdate(java.lang.Void... values) {
    super.onProgressUpdate(values);
    mProgressDialog.setIndeterminate(false);
    mProgressDialog.setMax(100);
    mProgressDialog.setMessage("Hoàn thành ");
}