public void updateList() {
    newsAdapter.updateAllList();
    newsAdapter.notifyDataSetChanged();
    if ((((((lexpressDone) && (defiDone)) && (ionDone)) && (teleplusDone)) && (cinqplusDone)) && (mauricienDone)) {
        progressBar.setVisibility(View.GONE);
        swipeRefreshLayout.setRefreshing(false);
        listView.setSelectionAfterHeaderView();
    }
}