public void requestAuthorization() {
    android.app.AlertDialog.Builder dlgAlert = new android.app.AlertDialog.Builder(this);
    dlgAlert.setMessage("Please choose an identity!");
    dlgAlert.setTitle("Choose an identity");
    dlgAlert.setPositiveButton("Ok", new net.named_data.accessmanager.MainActivity.AuthorizeOnClickListener(net.named_data.accessmanager.MainActivity.APP_NAME));
    dlgAlert.setCancelable(false);
    dlgAlert.create().show();
}