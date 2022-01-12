@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    boolean retval = true;
    switch (item.getItemId()) {
        case android.R.id.home :
            onBackPressed();
            break;
        case R.id.change_password :
            changeAccountPassword(account);
            break;
        case R.id.delete_account :
            openAccountRemovalConfirmationDialog(account);
            break;
        default :
            retval = super.onOptionsItemSelected(item);
            break;
    }
    return retval;
}