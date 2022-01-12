public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getArticleDetailById(long id) {
    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> article = aDao.getArticleDetailById(id);
    if (!(article.isEmpty()))
        article.get(0).put("tags", aDao.getArticleTagsById(java.lang.Integer.parseInt(article.get(0).get("id").toString())));
    
    return article;
}