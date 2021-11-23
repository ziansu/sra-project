@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... voids) {
    java.lang.String rawStringMovies = new data.MoviesHttpClient(utils.Utils.POPULAR_URL).getMovieData();
    data.JSONParser parser = new data.JSONParser();
    try {
        java.util.List<model.Movie> movies = parser.getMovieData(rawStringMovies);
        model.AppModel.getInstance().setMovies(movies);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return null;
}