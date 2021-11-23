private void hideProgress() {
    if (((shortcut) == null) || (!(shortcut.isValid()))) {
        return ;
    }
    switch (shortcut.getFeedback()) {
        case ch.rmy.android.http_shortcuts.realm.models.Shortcut.FEEDBACK_DIALOG :
            {
                if ((progressDialog) != null) {
                    progressDialog.dismiss();
                    progressDialog = null;
                }
                break;
            }
        case ch.rmy.android.http_shortcuts.realm.models.Shortcut.FEEDBACK_ACTIVITY :
            {
                progressSpinner.setVisibility(View.GONE);
                responseText.setVisibility(View.VISIBLE);
                break;
            }
    }
}