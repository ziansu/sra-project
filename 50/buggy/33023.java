@java.lang.Override
public java.util.List<com.example.android.newsapp.Article> loadInBackground() {
    if ((url) == null) {
        return null;
    }
    android.util.Log.v(com.example.android.newsapp.ArticleLoader.LOG_TAG, ("Loading URL: " + (url)));
    return com.example.android.newsapp.QueryUtils.fetchData(url);
}