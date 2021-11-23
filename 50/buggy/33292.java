private void showProgressDialog(final java.lang.String message) {
    jackpal.androidterm.Term.mActivity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mProgressDialog = android.app.ProgressDialog.show(jackpal.androidterm.Term.mContext, null, message);
        }
    });
}