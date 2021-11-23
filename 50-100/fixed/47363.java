private void printAlertDialog(java.lang.String message) {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
    builder.setTitle("LOGIN DIALOG");
    builder.setMessage(message);
    builder.setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int id) {
        }
    });
    builder.show();
}