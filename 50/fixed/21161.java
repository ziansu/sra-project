public void swap(java.util.List<edu.udacity.mou.project.popularmovies.model.Movie> newMovies) {
    mMovies.clear();
    if (((mMovies) != null) && (newMovies != null)) {
        mMovies.addAll(newMovies);
    }
    notifyDataSetChanged();
}