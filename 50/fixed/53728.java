@java.lang.Override
protected void onPreExecute() {
    progDailog = new android.app.ProgressDialog(this);
    progDailog.setMessage("Chargement des fiches...");
    progDailog.setIndeterminate(false);
    progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    progDailog.setCancelable(false);
    progDailog.show();
}