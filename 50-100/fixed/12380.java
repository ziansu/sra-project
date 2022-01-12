public static android.app.AlertDialog showAlertDialog(android.content.Context context, int messageId, android.content.DialogInterface.OnClickListener positiveAction) {
    android.app.AlertDialog.Builder adb = new android.app.AlertDialog.Builder(context);
    adb.setTitle(messageId);
    adb.setNegativeButton(context.getString(R.string.cancel), null);
    adb.setPositiveButton(context.getString(R.string.ok), positiveAction);
    return adb.show();
}