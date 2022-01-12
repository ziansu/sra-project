@java.lang.Override
public boolean onActionItemClicked(android.support.v7.view.ActionMode mode, android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.deck_delete_selected :
            {
                mListAdapter.deleteSelectedItems();
                mActionMode.finish();
                return true;
            }
        default :
            {
                return false;
            }
    }
}