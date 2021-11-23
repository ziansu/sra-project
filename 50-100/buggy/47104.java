@java.lang.Override
public void onClick(android.view.View view, int position) {
    startActivity(new android.content.Intent(this, pl.edu.pwr.swim.teteruk.movieslib.MovieSlidePagerActivity.class));
    pl.edu.pwr.swim.teteruk.movieslib.data.model.Movie movie = mMoviesList.get(position);
    android.content.Intent openDetails = new android.content.Intent(this, pl.edu.pwr.swim.teteruk.movieslib.MovieSlidePagerActivity.class);
    openDetails.putExtra(MovieSlidePagerActivity.MOVIE, movie);
    openDetails.putExtra(MovieSlidePagerActivity.MOVIE_POSITION, position);
    startActivityForResult(openDetails, MovieSlidePagerActivity.REQUEST_MOVIE_DETAILS);
}