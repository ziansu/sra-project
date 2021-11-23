private void showUnsavedChangesDialog(android.content.DialogInterface.OnClickListener discardButtonClickListener) {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
    builder.setMessage(R.string.discard_changes_prompt);
    builder.setPositiveButton(R.string.discard_confirm, discardButtonClickListener);
    builder.setNegativeButton(R.string.continue_edit, null);
    android.app.AlertDialog alertDialog = builder.create();
    alertDialog.show();
}