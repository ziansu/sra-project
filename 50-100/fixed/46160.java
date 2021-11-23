public static com.mayacarlsen.article.Article getArticle(java.lang.Integer articleId) {
    try (org.sql2o.Connection conn = com.mayacarlsen.article.ArticleDAO.sql2o.open()) {
        return conn.createQuery(com.mayacarlsen.article.ArticleDAO.SELECT_ARTICLE_SQL).addParameter("article_id", articleId).executeAndFetchFirst(com.mayacarlsen.article.Article.class);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}