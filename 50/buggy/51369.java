private void obtainTrailersAndReviews() {
    java.lang.String movieIdString = java.lang.Integer.toString(movie.getMovieId());
    new com.dyomin.udatraining.popmovapp.DetailsFragment.TrailersUploader().execute(movieIdString);
    new com.dyomin.udatraining.popmovapp.DetailsFragment.ReviewsUploader().execute(movieIdString);
}