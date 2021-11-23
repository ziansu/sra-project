public void updateList() {
    if ((((((lexpressDone) && (defiDone)) && (ionDone)) && (teleplusDone)) && (cinqplusDone)) && (mauricienDone)) {
        newsAdapter.updateAllList();
        newsAdapter.notifyDataSetChanged();
        progressBar.setVisibility(View.GONE);
        swipeRefreshLayout.setRefreshing(false);
        listView.setSelectionAfterHeaderView();
    }
}