private boolean needUpdateTag(com.yamixed.fav.entity.Article article, javax.servlet.http.HttpServletRequest request) {
    java.lang.String customTag = request.getParameter("customTag");
    if (!(org.springframework.util.StringUtils.isEmpty(customTag))) {
        return true;
    }
    java.lang.String selectedTag = request.getParameter("selectTagId");
    java.lang.Long newTagID = java.lang.Long.valueOf(selectedTag);
    com.yamixed.fav.entity.Tag tag = article.getTag();
    return (newTagID.longValue()) != (tag.getId().longValue());
}