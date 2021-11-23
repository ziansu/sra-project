@java.lang.Override
protected void onPreExecute() {
    loading = android.app.ProgressDialog.show(context, "Loading", "Please Wait...");
}