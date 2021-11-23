public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
    finish();
    java.lang.System.exit(0);
    startActivityForResult(new android.content.Intent(android.provider.Settings.ACTION_SETTINGS), 0);
}