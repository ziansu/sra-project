protected void onEditTextChanged() {
    android.app.Dialog dlg = getDialog();
    if (dlg instanceof android.app.AlertDialog) {
        android.app.AlertDialog alertDlg = ((android.app.AlertDialog) (dlg));
        android.widget.Button btn = alertDlg.getButton(AlertDialog.BUTTON_POSITIVE);
        boolean enable = Patterns.WEB_URL.matcher(getEditText().getText().toString()).matches();
        btn.setEnabled(enable);
        if (!enable) {
            this.getEditText().setError("Invalid URL");
        }
    }
}