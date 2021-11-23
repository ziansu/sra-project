private void showAlert(java.lang.String msg) {
    android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(this);
    builder.setTitle(getString(R.string.show_result)).setMessage(msg).setPositiveButton(getString(R.string.ok), new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int whichButton) {
            dialog.cancel();
            initialize();
        }
    });
    android.support.v7.app.AlertDialog dialog = builder.create();
    dialog.show();
}