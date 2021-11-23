public void showWarning(java.lang.String message, final hu.agabor.framework.BPresenter.DialogListener listener) {
    android.app.AlertDialog.Builder dialogBuilder = new android.app.AlertDialog.Builder(getContext());
    dialogBuilder.setTitle(android.R.string.dialog_alert_title).setMessage(message).setCancelable(false).setPositiveButton(android.R.string.ok, new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            dialog.dismiss();
            if (listener != null)
                listener.onReturn();
            
        }
    }).create().show();
}