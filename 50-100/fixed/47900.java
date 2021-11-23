public static void showProgressDialog(java.lang.String message, android.content.Context context) {
    if ((com.munir.harbingerstudio.firebasepoweredlogin.BaseActivity.mProgressDialog) == null) {
        com.munir.harbingerstudio.firebasepoweredlogin.BaseActivity.mProgressDialog = new android.app.ProgressDialog(context);
        com.munir.harbingerstudio.firebasepoweredlogin.BaseActivity.mProgressDialog.setMessage(message);
        com.munir.harbingerstudio.firebasepoweredlogin.BaseActivity.mProgressDialog.setIndeterminate(true);
    }
    if (context != null) {
        com.munir.harbingerstudio.firebasepoweredlogin.BaseActivity.mProgressDialog.show();
    }
}