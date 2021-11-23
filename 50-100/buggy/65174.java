@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    this.reallyLogin(result);
    if (this.progressDialog.isShowing()) {
        this.progressDialog.dismiss();
    }
    android.widget.Toast.makeText(this.context, "Log in successfully !", Toast.LENGTH_LONG);
}