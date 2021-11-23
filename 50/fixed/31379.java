@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    barProgress3 = new android.app.ProgressDialog(this);
    barProgress3.setTitle("Sauvegarde de votre alimentation en cours...");
    barProgress3.show();
}