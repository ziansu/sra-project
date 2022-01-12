private org.json.JSONArray getMovieDataFromJSON(java.lang.String movieJSONStr) throws org.json.JSONException {
    final java.lang.String MOVIE_LIST = "results";
    org.json.JSONObject movieJSON = new org.json.JSONObject(movieJSONStr);
    movieArray = movieJSON.getJSONArray(MOVIE_LIST);
    return movieArray;
}