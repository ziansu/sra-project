@java.lang.Override
public com.juric.carbon.schema.article.Article save(com.juric.carbon.schema.article.Article article) {
    articleMapper.save(new com.practice.article.ArticleDB(article));
    return article;
}