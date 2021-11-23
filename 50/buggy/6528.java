public java.util.List<hear.app.models.Article> getCacheArticles() {
    if ((mArticle) == null) {
        mArticle = hear.app.store.CollectedArticleStore.getInstance().getArticles();
    }
    return mArticle;
}