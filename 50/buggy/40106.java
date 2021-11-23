@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    loading = android.app.ProgressDialog.show(this, "Fetching...", "Wait...", false, false);
}