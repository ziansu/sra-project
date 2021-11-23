public com.harry.winser.api.domain.comment.Comment build() {
    com.harry.winser.api.domain.comment.Comment comment = new com.harry.winser.api.domain.comment.Comment();
    comment.setId(this.id);
    comment.setGuid(this.guid);
    comment.setUserName(this.userName);
    comment.setComment(this.comment);
    comment.setCreateDate(this.createDate);
    comment.setArticleTitle(this.articleTitle);
    return comment;
}