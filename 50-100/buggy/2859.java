@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.example.gabriel.popularmovies.MovieFragment.MovieFragment fragment = new com.example.gabriel.popularmovies.MovieFragment.MovieFragment();
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.add(R.id.container, fragment);
    fragmentTransaction.commit();
}