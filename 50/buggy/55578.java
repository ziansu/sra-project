private void createGridViewAdapter() {
    moviesAdapter = new com.example.android.popularmovies.app.MoviesAdapter(new java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>>(), getActivity(), getContext());
    updateMoviesViewMode();
    gridView.setAdapter(moviesAdapter);
}