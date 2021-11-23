public void cachePosts(java.lang.String key, final com.push.app.model.ArticlePost articles) {
    sharedPreferences = getSharedPreferences("preferences", Activity.MODE_PRIVATE);
    if ((sharedPreferences) != null) {
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(articles);
        editor.putString(key, json);
        editor.commit();
    }
}