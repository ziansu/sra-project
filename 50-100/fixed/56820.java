public void showOfflineAlert() {
    android.support.v7.app.AlertDialog.Builder builder1 = new android.support.v7.app.AlertDialog.Builder(this);
    builder1.setMessage("Need internet connection to view articles. ");
    builder1.setCancelable(true);
    builder1.setNeutralButton("Ok", new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int id) {
            dialog.cancel();
        }
    });
    android.support.v7.app.AlertDialog alert11 = builder1.create();
    alert11.show();
}