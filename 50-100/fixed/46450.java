@java.lang.Override
protected void onPostExecute(java.lang.Boolean viewSet) {
    if (!(networkDetailsListToAdapter.isEmpty())) {
        android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentByTag("noDataImage");
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(fragment).commit();
        }
    }
    if (viewSet) {
        recyclerView.setAdapter(adapter);
    }else {
        recyclerView.swapAdapter(adapter, false);
    }
    swipeRefreshLayout.setRefreshing(false);
}