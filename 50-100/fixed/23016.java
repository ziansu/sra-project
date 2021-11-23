public com.push.app.model.ArticlePost getCachedPosts(java.lang.String key) {
    sharedPreferences = getSharedPreferences("preferences", Activity.MODE_PRIVATE);
    com.push.app.model.ArticlePost articlePost = new com.push.app.model.ArticlePost();
    if ((sharedPreferences) != null) {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = sharedPreferences.getString(key, "");
        articlePost = gson.fromJson(json, com.push.app.model.ArticlePost.class);
    }
    return articlePost;
}