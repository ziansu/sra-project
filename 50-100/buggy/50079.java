@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_movies);
    com.mynanodegreeapps.Movies.MovieFragment pmf = new com.mynanodegreeapps.Movies.MovieFragment();
    if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction().add(R.id.popularmoviecontainer, new com.mynanodegreeapps.Movies.MovieFragment()).commit();
    }
}