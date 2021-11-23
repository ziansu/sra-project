public void alertView(java.lang.String message, java.lang.String title) {
    android.app.AlertDialog.Builder dialog = new android.app.AlertDialog.Builder(this);
    dialog.setTitle(title).setMessage(message).setPositiveButton("Ok", new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialoginterface, int i) {
        }
    }).show();
}