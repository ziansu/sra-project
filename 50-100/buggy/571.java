@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_refresh :
            if ((swipeRefreshLayout) != null) {
                swipeRefreshLayout.setRefreshing(true);
                new android.os.Handler().postDelayed(new java.lang.Runnable() {
                    @java.lang.Override
                    public void run() {
                        onRefresh();
                    }
                }, 500);
                return true;
            }
        default :
            return super.onOptionsItemSelected(item);
    }
}