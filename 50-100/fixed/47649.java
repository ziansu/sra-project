private com.intelliviz.moviefinder.Review extractReviewFromJson(org.json.JSONObject object) {
    try {
        com.intelliviz.moviefinder.Review review = null;
        if ((mMovie) != null) {
            java.lang.String author = object.getString("author");
            java.lang.String content = object.getString("content");
            review = new com.intelliviz.moviefinder.Review(mMovie.getMovieId(), author, content);
        }
        return review;
    } catch (org.json.JSONException e) {
        android.util.Log.e(com.intelliviz.moviefinder.ui.MovieDetailsFragment.TAG, "Error reading review");
    }
    return null;
}