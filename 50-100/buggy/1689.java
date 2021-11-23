public com.silverpeas.comment.model.Comment toComment() {
    com.silverpeas.comment.model.Comment comment = new com.silverpeas.comment.model.Comment(new com.silverpeas.comment.model.CommentPK(id, componentId), new com.stratelia.webactiv.util.publication.model.PublicationPK(resourceId, componentId), java.lang.Integer.valueOf(author.getId()), author.getFullName(), text, com.silverpeas.comment.web.CommentEntity.decodeFromDisplayDate(creationDate, getAuthor().getLanguage()), com.silverpeas.comment.web.CommentEntity.decodeFromDisplayDate(modificationDate, getAuthor().getLanguage()));
    comment.setOwnerDetail(author.toUser());
    return comment;
}