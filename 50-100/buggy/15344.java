@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.preference.PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
    mSortOrder = com.odytrice.popularmovies.utils.PreferenceUtils.getSortOrder(this);
    if ((findViewById(R.id.movie_detail_container)) == null) {
        mTwoPane = true;
        if (savedInstanceState == null)
            getSupportFragmentManager().beginTransaction().replace(R.id.movie_detail_container, new com.odytrice.popularmovies.fragments.DetailFragment()).commit();
        
    }
    setContentView(R.layout.activity_main);
}