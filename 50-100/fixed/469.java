private boolean fetchViews() {
    searchView = ((android.widget.SearchView) (findViewById(R.id.searchview_id)));
    recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.search_result_listview)));
    if ((recyclerView) == null) {
        android.util.Log.e(xodebox.food.ui.view.SearchResultView.TAG, "fetchViews: Cannot find recycler view.");
        return false;
    }
    return true;
}