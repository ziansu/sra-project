public com.harry.winser.api.domain.comment.Comment build() {
    com.harry.winser.api.domain.comment.Comment comment = new com.harry.winser.api.domain.comment.Comment();
    comment.setId(id);
    comment.setGuid(guid);
    comment.setUserName(userName);
    comment.setComment(comment);
    comment.setCreateDate(createDate);
    comment.setArticleTitle(articleTitle);
    return comment;
}