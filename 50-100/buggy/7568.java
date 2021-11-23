@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
    if (savedInstanceState == null) {
        android.os.Bundle args = new android.os.Bundle();
        args.putParcelable(DetailFragment.DETAIL_URI, getIntent().getData());
        com.odytrice.popularmovies.fragments.DetailFragment fragment = new com.odytrice.popularmovies.fragments.DetailFragment();
        fragment.setArguments(args);
        getSupportFragmentManager().beginTransaction().replace(R.id.movie_detail_container, new com.odytrice.popularmovies.fragments.DetailFragment()).commit();
    }
}