@java.lang.Override
public void success(com.focusandcode.popularmovies.Entities.ListMovieReviews data, retrofit.client.Response response) {
    android.util.Log.d(com.focusandcode.popularmovies.DetailActivityFragment.LOG_TAG, ("Reviews: " + (data.toString())));
    movieReviews = data.getResults();
    for (int i = 0; i < (movieReviews.size()); i++) {
        com.focusandcode.popularmovies.Entities.MovieReview review = movieReviews.get(i);
        if ((reviewContainer) != null)
            reviewContainer.addView(buildReview(review));
        
    }
}