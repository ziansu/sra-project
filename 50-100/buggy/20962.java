@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_import :
            {
                android.content.Intent intent = new android.content.Intent(this, me.sheimi.sgit.activities.explorer.ExploreFileActivity.class);
                startActivityForResult(intent, me.sheimi.sgit.activities.explorer.PrivateKeyManageActivity.REQUEST_IMPORT_KEY);
                forwardTransition();
                return true;
            }
        case R.id.action_generate :
            {
                new me.sheimi.sgit.activities.explorer.PrivateKeyGenerate(this).show(getFragmentManager(), "generate-key");
                refreshList();
                return true;
            }
    }
    return super.onOptionsItemSelected(item);
}