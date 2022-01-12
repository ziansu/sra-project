@java.lang.Override
public void onClick(android.view.View view) {
    int position = rvMovies.getChildLayoutPosition(view);
    com.udacity.mauricio.popularmovies.models.MovieDTO movie = adapter.getMovies().get(position);
    movie.isFavorite = localRepository.hasMovie(movie);
    android.support.v4.app.ActivityOptionsCompat options = android.support.v4.app.ActivityOptionsCompat.makeSceneTransitionAnimation(activity, android.support.v4.util.Pair.create(view.findViewById(R.id.ivPoster), getString(R.string.movie_poster_trasition_name)), android.support.v4.util.Pair.create(view.findViewById(R.id.tvDescription), getString(R.string.movie_overview_trasition_name)));
    listener.onItemSelected(movie, options);
}