protected void fetchData() {
    try {
        java.net.URL url = new com.weihua.newyorktimes.search.SearchUrlBuilder().setBeginDate(com.weihua.newyorktimes.search.SearchActivity.DEFAULT_SEARCH_BEGIN_DATE).setQuery((searchQuery.getText().toString().equals("") ? com.weihua.newyorktimes.search.SearchActivity.DEFAULT_CATEGORY : searchQuery.getText().toString())).setSort(SORT_TYPE.NEWEST).build();
        fetchData(url);
    } catch (java.net.MalformedURLException e) {
        android.util.Log.e("Search", "search error");
        e.printStackTrace();
    }
}