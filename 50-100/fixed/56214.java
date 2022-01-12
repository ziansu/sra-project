private void showErrorDialog(final java.lang.String title, final java.lang.String message) {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
    builder.setIcon(android.R.drawable.ic_dialog_alert);
    builder.setTitle(title);
    builder.setMessage(message);
    builder.setPositiveButton(R.string.sonycamera_ok, new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(final android.content.DialogInterface dialog, final int whichButton) {
        }
    });
    builder.setCancelable(true);
    builder.show();
    mServiceIdView.setText(R.string.sonycamera_no_device);
}