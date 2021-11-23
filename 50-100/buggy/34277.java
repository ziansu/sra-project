@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_save :
            updateProfile();
            return true;
        default :
            if (save.isVisible()) {
                com.socket9.tsl.Utils.DialogHelper.getUpdateProfileDialog(this, new com.afollestad.materialdialogs.MaterialDialog.SingleButtonCallback() {
                    @java.lang.Override
                    public void onClick(com.afollestad.materialdialogs.MaterialDialog materialDialog, com.afollestad.materialdialogs.DialogAction dialogAction) {
                        finish();
                    }
                }).show();
            }
    }
    return false;
}