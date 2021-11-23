public static java.util.List<com.mayacarlsen.article.Article> getAllPublishArticles() {
    try (org.sql2o.Connection conn = com.mayacarlsen.article.ArticleDAO.sql2o.open()) {
        return conn.createQuery(com.mayacarlsen.article.ArticleDAO.SELECT_ALL_PUBLISH_ARTICLES_SQL).executeAndFetch(com.mayacarlsen.article.Article.class);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}