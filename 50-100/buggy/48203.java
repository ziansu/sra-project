public void cachePosts(final com.push.app.model.ArticlePost articles) {
    android.util.Log.d("AFTER CACHE", ((articles.getResults().size()) + ""));
    sharedPreferences = getSharedPreferences("preferences", Activity.MODE_PRIVATE);
    if ((sharedPreferences) != null) {
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(articles);
        editor.putString("Articles", json);
        editor.commit();
    }
}