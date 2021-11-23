public void showSplash() {
    mProgressDialog = new android.app.ProgressDialog(this, R.style.custom_dialog);
    mProgressDialog.setCancelable(false);
    mProgressDialog.show();
    mProgressDialog.setContentView(R.layout.splash_screen);
}