private void showSpinner(java.lang.String message) {
    this.mSpinner = new android.app.ProgressDialog(this);
    this.mSpinner.setMessage(message);
    this.mSpinner.setCancelable(false);
    this.mSpinner.show();
}