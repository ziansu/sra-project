@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            closeAndGoBack();
            return true;
        case R.id.preferences_menu_id :
            startMyPreferenceActivity();
            break;
        case R.id.remove_account_menu_id :
            org.andstatus.app.util.DialogFactory.showYesCancelDialog(getSupportFragmentManager().findFragmentById(R.id.fragmentOne), R.string.remove_account_dialog_title, R.string.remove_account_dialog_text, ActivityRequestCode.REMOVE_ACCOUNT);
        default :
            break;
    }
    return super.onOptionsItemSelected(item);
}