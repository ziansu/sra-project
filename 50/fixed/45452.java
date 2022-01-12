public void postGenres(android.content.Context c, org.json.JSONArray genresArr) {
    com.melodies.bandup.DatabaseSingleton.getInstance(c).getBandUpDatabase().postGenres(genresArr, getPickListener(), getPickErrorListener(c));
}