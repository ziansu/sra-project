public static void showDialog(android.content.Context context, int title, int message, int positiveMsg, int negativeMsg, android.content.DialogInterface.OnClickListener okListener) {
    com.shuruta.sergey.ftpclient.ui.DialogFactory.showDialog(context, context.getString(title), context.getString(message), positiveMsg, negativeMsg, okListener, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int id) {
            dialog.dismiss();
        }
    });
}