@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_settings :
            return true;
        case R.id.action_add :
            com.strsz.rssreader.AddFeedFragment newFragment = new com.strsz.rssreader.AddFeedFragment();
            android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.frame, newFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        case R.id.action_refresh :
            fragment.refreshData();
        default :
            return super.onOptionsItemSelected(item);
    }
}