@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case android.R.id.home :
            if ((mKeyboardFocus) != null) {
                mKeyboardFocus.onBackListener();
                setResult(net.moltendorf.checklists.RESULT_OK);
                finish();
            }
            break;
        case R.id.action_rename :
            renameList();
            break;
        case R.id.action_delete :
            showDeleteDialog();
            break;
    }
    return super.onOptionsItemSelected(item);
}