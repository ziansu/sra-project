public static void showInfoDialog(android.content.Context context) {
    new android.support.v7.app.AlertDialog.Builder(context).setTitle(R.string.info_dialog_title).setMessage(R.string.info_dialog_message).setPositiveButton(R.string.info_dialog_positive_btn, new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
        }
    }).show();
}