private void showDialogConfirm(java.lang.String message) {
    new android.support.v7.app.AlertDialog.Builder(this).setIcon(R.drawable.ic_information).setTitle("Confirm").setMessage(message).setPositiveButton("No", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
        }
    }).setNegativeButton("Yes", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            bookLibrary.close();
            java.lang.System.exit(0);
        }
    }).show();
}