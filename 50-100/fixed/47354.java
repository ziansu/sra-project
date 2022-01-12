@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
    if (savedInstanceState == null) {
        arguments = new android.os.Bundle();
        arguments.putParcelable(MovieDetailFragment.DETAIL_URI, getIntent().getData());
        mDF = new com.example.jamie.popularmovies.fragments.MovieDetailFragment();
        mDF.setArguments(arguments);
        getSupportFragmentManager().beginTransaction().replace(R.id.movie_detail_container, mDF, MainActivity.DETAIL_FRAGMENT_TAG).commit();
    }
}