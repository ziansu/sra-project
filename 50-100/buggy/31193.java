public void showChooseAlertDialog(int messageId, android.content.DialogInterface.OnClickListener ok, android.content.DialogInterface.OnClickListener cancel) {
    android.app.AlertDialog dialog = new android.app.AlertDialog.Builder(mContext).setMessage(mContext.getResources().getString(messageId)).setPositiveButton(mContext.getResources().getString(R.string.confirm), ok).setNegativeButton(mContext.getResources().getString(R.string.cancel), cancel).setCancelable(false).create();
    dialog.show();
}