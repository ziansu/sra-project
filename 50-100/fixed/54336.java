@java.lang.Override
public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, org.json.JSONObject responseBody) {
    org.json.JSONArray items = null;
    try {
        items = responseBody.getJSONArray("movies");
        java.util.ArrayList<edu.gatech.snickers.techflixandchill.BoxOfficeMovie> movies = edu.gatech.snickers.techflixandchill.BoxOfficeMovie.fromJson(items);
        for (edu.gatech.snickers.techflixandchill.BoxOfficeMovie movie : movies) {
            adapterMovies.add(movie);
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}