@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mSortBy = com.ishaihachlili.nano.movies.Utility.getSortingOrder(this);
    setContentView(R.layout.activity_main);
    mTwoPane = (findViewById(R.id.movie_detail_container)) != null;
    if (mTwoPane) {
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.movie_detail_container, new com.ishaihachlili.nano.movies.DetailActivityFragment(), com.ishaihachlili.nano.movies.MainActivity.DETAILFRAGMENT_TAG).commit();
        }
    }
}