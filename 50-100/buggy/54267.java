@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if ((findViewById(R.id.fragment_container_movie_posters)) != null) {
        if (savedInstanceState != null) {
            return ;
        }
        android.support.v4.app.Fragment moviePostersFragment = com.example.ozefet.udacitymovies.Main.MoviePostersFragment.newInstance();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_movie_posters, moviePostersFragment).commit();
    }
}