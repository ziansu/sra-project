@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_details);
    mBinding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_details);
    android.content.Intent intent = getIntent();
    if ((intent != null) && (intent.hasExtra(Intent.EXTRA_TEXT))) {
        myMovie = intent.getParcelableExtra(Intent.EXTRA_TEXT);
        android.util.Log.d(com.example.android.popularmoviesapp.DetailsActivity.TAG, ("Clicked movie: " + (myMovie.toString())));
    }
    displayMovieDetails(myMovie);
}