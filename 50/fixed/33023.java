@java.lang.Override
public java.util.List<com.example.android.newsapp.Article> loadInBackground() {
    if ((url) == null) {
        return null;
    }
    return com.example.android.newsapp.QueryUtils.fetchData(url);
}