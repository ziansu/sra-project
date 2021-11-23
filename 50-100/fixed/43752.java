@java.lang.Override
public boolean deleteArticleByTypeAndId(com.cnxs.enums.ArticleType type, int id) {
    com.cnxs.bo.Article article = this.get(id);
    if (((null == article) || ((article.getType()) != type)) || (article.isDeleted())) {
        return false;
    }
    article.setDeleted(true);
    return true;
}