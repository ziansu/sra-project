@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_refresh :
            if ((swipeRefreshLayout) != null) {
                swipeRefreshLayout.setRefreshing(true);
                new android.os.Handler().postDelayed(this::onRefresh, 500);
                return true;
            }
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}