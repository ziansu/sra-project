public void fetchMovies() {
    java.lang.String category = com.example.joel.popularmovies.Utility.getCurrentCategory(getActivity());
    com.example.joel.popularmovies.MainActivityFragment.FetchMovieList moviesTask = new com.example.joel.popularmovies.MainActivityFragment.FetchMovieList();
    moviesTask.execute(category);
}