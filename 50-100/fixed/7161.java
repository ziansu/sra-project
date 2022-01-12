@java.lang.Override
protected java.util.List<com.jojo.googlenewsreader.pojo.Article> doInBackground(java.lang.Void... params) {
    java.util.List<com.jojo.googlenewsreader.pojo.Article> articles = new java.util.ArrayList<>();
    try {
        if (query.equals(com.jojo.googlenewsreader.asyncTasks.LoadArticleAsyncTask.DEFAULT_RESEARCH)) {
            articles = searchFromQuery(com.jojo.googlenewsreader.asyncTasks.LoadArticleAsyncTask.DEFAULT_RESEARCH);
        }else {
            query = java.net.URLEncoder.encode(query, "UTF-8");
            articles = searchFromQuery(((com.jojo.googlenewsreader.asyncTasks.LoadArticleAsyncTask.API_URL) + (query)));
        }
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    return articles;
}