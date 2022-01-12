protected java.lang.Void doInBackground(java.lang.Void... params) {
    article = org.ttrssreader.controllers.DBHelper.getInstance().getArticle(articleId);
    if ((article) == null)
        return null;
    
    feed = org.ttrssreader.controllers.DBHelper.getInstance().getFeed(article.feedId);
    if (article.isUnread) {
        article.isUnread = false;
        new org.ttrssreader.model.updaters.Updater(null, new org.ttrssreader.model.updaters.ArticleReadStateUpdater(article, 0)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }
    markedRead = true;
    cachedImages = getCachedImagesJS(article.id);
    webviewInitialized = false;
    return null;
}