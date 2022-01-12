public static void showMessage(android.content.Context context, java.lang.String title, java.lang.String message, android.content.DialogInterface.OnClickListener okListener) {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
    builder.setMessage(message).setPositiveButton(R.string.ok, (okListener == null ? new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            dialog.dismiss();
        }
    } : okListener));
    builder.create().show();
}