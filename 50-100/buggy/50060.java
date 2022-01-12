public void buildTags(com.wushengjie.service.Article article) {
    deleteArticleTagRelationByArticleId(article.getId());
    for (com.wushengjie.service.Tag tag : article.getTags()) {
        com.wushengjie.service.ArticleTags relative = new com.wushengjie.service.ArticleTags();
        relative.setArticleId(article.getId());
        relative.setTagId(tag.getId());
        relative.setCreateTime(new java.util.Date());
        articleTagsDao.insert(relative);
    }
}