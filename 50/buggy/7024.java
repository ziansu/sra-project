@java.lang.Override
public void saveArticleInHistory(wikipedia.Article article) {
    requestedArticles.add(article.getTitle());
    articleMap.put(article.getTitle(), article);
}