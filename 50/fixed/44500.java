@java.lang.Override
public void saveArticle(com.tvntd.models.Article article) {
    articleRepo.save(article);
}