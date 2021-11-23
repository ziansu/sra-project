private org.zunpeng.service.article.SimpleArticleInfo trans2SimpleArticle(org.zunpeng.domain.ArticleInfo articleInfo) {
    if (articleInfo == null) {
        return null;
    }
    org.zunpeng.service.article.SimpleArticleInfo simpleArticleInfo = com.oldpeng.core.utils.BeanCopyUtils.copy(articleInfo, org.zunpeng.service.article.SimpleArticleInfo.class);
    simpleArticleInfo.setCoverUrl(imageService.buildUrl(articleInfo.getCoverImg()));
    return simpleArticleInfo;
}