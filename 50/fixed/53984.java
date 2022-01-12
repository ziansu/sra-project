@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_delete_from_trash :
            handleRemoveFromTrashAction();
            break;
        case R.id.action_restore_from_trash :
            handleRestoreFromTrashAction();
            break;
    }
    return true;
}