public int getLastMovieId() {
    org.json.simple.JSONObject lastMovie = ((movies.size()) > 0) ? ((org.json.simple.JSONObject) (movies.get(((movies.size()) - 1)))) : null;
    int lastId = 0;
    if (lastMovie != null) {
        lastId = java.lang.Integer.parseInt(lastMovie.get("id").toString());
    }
    return lastId;
}