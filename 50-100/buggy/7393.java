public java.util.Map<java.lang.String, java.lang.Object> getArticleDetailById(long id) {
    java.util.Map<java.lang.String, java.lang.Object> article = aDao.getArticleDetailById(id);
    article.put("tags", aDao.getArticleTagsById(java.lang.Integer.parseInt(article.get("id").toString())));
    return article;
}