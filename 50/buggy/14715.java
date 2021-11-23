@java.lang.Override
public void onLoadMore(int page, int totalItemsCount, android.support.v7.widget.RecyclerView view) {
    if (!(filteredSearch)) {
        loadNextDataFromApi(searchQuery, page, view);
    }else {
        loadNextDataFilteredSearch(page, view);
    }
}