@java.lang.Override
public void onRefresh() {
    if (!(adapter.isEmpty()))
        loadNewDataFromApi(adapter.getItem(0).uid);
    
    swipeContainer.setRefreshing(false);
}