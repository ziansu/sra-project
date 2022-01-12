@java.lang.Override
protected java.util.List<mx.evin.udacity.popularmovies.entities.ReviewResult> doInBackground(java.lang.Integer... params) {
    java.lang.String movieId = ((params.length) > 0) ? java.lang.String.valueOf(params[0]) : "293660";
    mx.evin.udacity.popularmovies.network.MoviesRetrofit moviesRetrofit = new mx.evin.udacity.popularmovies.network.MoviesRetrofit();
    mx.evin.udacity.popularmovies.entities.ReviewPage reviewPage = moviesRetrofit.getReviews(movieId);
    return reviewPage.getReviewResults();
}