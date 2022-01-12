@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getSupportActionBar()) != null) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }
    setupRecyclerView();
    if (savedInstanceState != null) {
        beerList = savedInstanceState.getParcelableArrayList(fassbier_finder.com.fassbierfinder.BeerList.STATE_BEERLIST);
        adapter.init(beerList);
    }else {
        startAsyncBeerDataFetch();
    }
}