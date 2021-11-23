private void showUnsavedChangesDialog(android.content.DialogInterface.OnClickListener discardButtonClickListener) {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
    builder.setMessage(R.string.discard_changes_prompt);
    builder.setPositiveButton(R.string.discard_confirm, discardButtonClickListener);
    builder.setNegativeButton(R.string.continue_edit, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int id) {
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    });
    android.app.AlertDialog alertDialog = builder.create();
    alertDialog.show();
}