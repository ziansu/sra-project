public java.util.ArrayList<com.test.movies.db.entity.Review> parseReviews(java.lang.String string) throws org.json.JSONException {
    org.json.JSONObject object = new org.json.JSONObject(string);
    android.util.Log.d("reviews_json", string);
    if (!(object.has("results")))
        throw new org.json.JSONException("Malforrmed response received - no results present.");
    
    return this.reviewsFromJson(object.getJSONArray("results"));
}