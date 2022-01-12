public void showSimpleAlertDialog(java.lang.String message) {
    android.app.AlertDialog dialog = new android.app.AlertDialog.Builder(mContext).setMessage(message).setPositiveButton(mContext.getResources().getString(R.string.confirm), null).setCancelable(true).create();
    dialog.show();
}