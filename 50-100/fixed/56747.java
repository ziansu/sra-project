public void showPasswordDialog(java.lang.String repoName, java.lang.String repoID, com.seafile.seadroid2.ui.dialog.TaskDialog.TaskDialogListener listener, java.lang.String password) {
    com.seafile.seadroid2.ui.dialog.PasswordDialog passwordDialog = new com.seafile.seadroid2.ui.dialog.PasswordDialog();
    passwordDialog.setRepo(repoName, repoID, mAccount);
    if (password != null) {
        passwordDialog.setPassword(password);
    }
    passwordDialog.setTaskDialogLisenter(listener);
    passwordDialog.show(getSupportFragmentManager(), com.seafile.seadroid2.ui.activity.SeafilePathChooserActivity.PASSWORD_DIALOG_FRAGMENT_TAG);
}