@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... voids) {
    java.lang.String rawStringMovies = new data.MoviesHttpClient(utils.Utils.POPULAR_URL).getMovieData();
    data.JSONParser parser = new data.JSONParser();
    try {
        movies = parser.getMovieData(rawStringMovies);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return null;
}