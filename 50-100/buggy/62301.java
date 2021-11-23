@java.lang.Override
public void addCommentToPost(java.lang.String postid, java.lang.String content, soa.model.entity.UserEntity author) {
    soa.model.entity.CommentEntity comment = new soa.model.entity.CommentEntity();
    comment.setContent(content);
    comment.setAuthor(author);
    soa.model.entity.PostEntity post = em.find(soa.model.entity.PostEntity.class, postid);
    comment.setCommentedPost(java.lang.Integer.valueOf(postid));
    post.getComments().add(comment);
    em.persist(comment);
    em.persist(postid);
    em.flush();
}