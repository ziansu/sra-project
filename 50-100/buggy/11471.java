public static void showDialog(android.content.Context context, int message, int positiveMsg, int negativeMsg, android.content.DialogInterface.OnClickListener okListener) {
    com.shuruta.sergey.ftpclient.ui.DialogFactory.showDialog(context, message, positiveMsg, negativeMsg, okListener, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int id) {
            dialog.dismiss();
        }
    });
}