private void loadMovieData() {
    if ((sortBy.isEmpty()) && ((sortBy) == null)) {
        new com.cats.lisamariewatkins.popularmovies.MainActivity.MovieTask().execute(com.cats.lisamariewatkins.popularmovies.MainActivity.DEFAULT_SORTING);
    }else {
        new com.cats.lisamariewatkins.popularmovies.MainActivity.MovieTask().execute(sortBy);
    }
}