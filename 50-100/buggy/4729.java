public static void showDialog(final android.content.Context context, java.lang.String message, final android.content.DialogInterface.OnClickListener positiveClickListener, final android.content.DialogInterface.OnClickListener negativeClickListener) {
    android.support.v7.app.AlertDialog.Builder alertDialogBuilder = new android.support.v7.app.AlertDialog.Builder(context);
    alertDialogBuilder.setTitle("").setMessage(message).setCancelable(false).setPositiveButton("Ok", positiveClickListener).setNegativeButton("Cancel", negativeClickListener);
    final android.support.v7.app.AlertDialog alertDialog = alertDialogBuilder.create();
    alertDialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() {
        @java.lang.Override
        public void onShow(android.content.DialogInterface arg0) {
        }
    });
    alertDialog.show();
}