public static void ShowAlert(android.content.Context context, java.lang.String bodyMessage) {
    new android.support.v7.app.AlertDialog.Builder(context).setTitle("Error").setMessage(bodyMessage).setCancelable(false).setPositiveButton("ok", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            dialog.dismiss();
        }
    }).show();
}