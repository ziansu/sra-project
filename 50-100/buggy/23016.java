public com.push.app.model.ArticlePost getCachedPosts() {
    sharedPreferences = getSharedPreferences("preferences", Activity.MODE_PRIVATE);
    com.push.app.model.ArticlePost articlePost = new com.push.app.model.ArticlePost();
    if ((sharedPreferences) != null) {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = sharedPreferences.getString("Articles", "");
        articlePost = gson.fromJson(json, com.push.app.model.ArticlePost.class);
    }
    return articlePost;
}