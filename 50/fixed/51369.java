private void obtainTrailersAndReviews(android.content.Context context) {
    java.lang.String movieIdString = java.lang.Integer.toString(movie.getMovieId());
    new com.dyomin.udatraining.popmovapp.DetailsFragment.TrailersUploader(context).execute(movieIdString);
    new com.dyomin.udatraining.popmovapp.DetailsFragment.ReviewsUploader(context).execute(movieIdString);
}