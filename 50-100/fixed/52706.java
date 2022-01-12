public com.nenu.innovation.entity.Article queryById(int id) throws java.lang.Exception {
    com.nenu.innovation.entity.Article article = new com.nenu.innovation.entity.Article();
    try {
        article = articleMapper.queryById(id);
        if (article != null) {
            setArticleTypeAndCreatorAndSchool(article);
        }
        return article;
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("根据id查询文章失败！");
        e.printStackTrace();
        throw new java.lang.Exception(e.getMessage());
    }
}