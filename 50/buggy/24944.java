@java.lang.Override
public com.juric.carbon.schema.article.Article getById(long articleId) {
    com.practice.article.ArticleDB articleDB = articleMapper.selectOne(articleId);
    return articleDB.getArticle();
}