private void dismissDialogIfOpen() {
    if ((mAlertDialog) != null) {
        mAlertDialog.dismiss();
        mAlertDialog = null;
    }
}