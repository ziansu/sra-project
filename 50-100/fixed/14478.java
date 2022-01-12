private com.star.people.model.ArticleInfoVO mapToArticleInfoVO(java.util.Map map) {
    com.star.people.model.ArticleInfoVO vo = new com.star.people.model.ArticleInfoVO();
    com.star.people.util.ObjectUtil.fromMap(map, vo, com.google.common.collect.Sets.newHashSet("publishtime"));
    java.util.Date date = ((java.util.Date) (map.get("publishtime")));
    if (date != null) {
        vo.setPublishtime(((java.util.Date) (map.get("publishtime"))));
    }
    return vo;
}