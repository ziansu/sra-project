private void showRetryDialog(java.lang.String title, java.lang.String text, com.antoshkaplus.recursivelists.dialog.RetryDialog.RetryDialogListener listener) {
    com.antoshkaplus.recursivelists.dialog.RetryDialog dialog = ((com.antoshkaplus.recursivelists.dialog.RetryDialog) (getFragmentManager().findFragmentByTag("retry_dialog")));
    if (dialog == null) {
        dialog = com.antoshkaplus.recursivelists.dialog.RetryDialog.newInstance(title, text);
    }
    dialog.setRetryDialogListener(listener);
    dialog.show(getFragmentManager(), "retry_dialog");
}