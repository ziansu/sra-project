@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if ((findViewById(R.id.movie_detail_container)) != null) {
        com.morxander.popularmovies.MainActivity.mTwoPane = true;
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_main, new com.morxander.popularmovies.MainActivity.PlaceholderFragment()).commit();
    }else {
        com.morxander.popularmovies.MainActivity.mTwoPane = false;
    }
}