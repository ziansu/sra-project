public java.util.Date getCommentDate(int postId, int commentId) {
    if ((posts.get(postId)) == null) {
        return new java.util.Date(0);
    }
    if ((posts.get(postId).comments) == null) {
        return new java.util.Date(0);
    }
    for (me.dibber.blablablapp.core.Post.Comment c : posts.get(postId).comments) {
        if ((c.id) == commentId) {
            return c.date;
        }
    }
    return new java.util.Date(0);
}