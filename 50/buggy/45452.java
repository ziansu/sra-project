public void postGenres(android.content.Context c, org.json.JSONArray genresArr) {
    com.melodies.bandup.DatabaseSingleton.getInstance(com.facebook.FacebookSdk.getApplicationContext()).getBandUpDatabase().postGenres(genresArr, getPickListener(), getPickErrorListener(c));
}