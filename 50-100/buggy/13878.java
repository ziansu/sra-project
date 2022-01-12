@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (android.R.id.home)) {
        android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
        overridePendingTransition(0, 0);
        return true;
    }else
        if ((item.getItemId()) == (R.id.action_clear)) {
            mSearchBar.clearText();
            mRecyclerView.smoothScrollToPosition(0);
            return true;
        }
    
    return super.onOptionsItemSelected(item);
}