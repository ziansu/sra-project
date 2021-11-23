public void startMoviesFragment() {
    getSupportFragmentManager().beginTransaction().add(R.id.grid_movies_fragment_container, new com.centaurs.tmdbapp.view.MoviesGridFragment()).addToBackStack(null).commit();
}