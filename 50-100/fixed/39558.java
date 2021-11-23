public static void showDialog(android.content.Context context, int message, android.content.DialogInterface.OnClickListener okListener) {
    com.shuruta.sergey.ftpclient.ui.DialogFactory.showDialog(context, null, context.getString(message), R.string.ok, R.string.cancel, okListener, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int id) {
            dialog.dismiss();
        }
    });
}