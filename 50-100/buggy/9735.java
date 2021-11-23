public java.util.Date getCommentDate(int postId, int commentId) {
    if ((posts.get(postId)) == null) {
        return null;
    }
    if ((posts.get(postId).comments) == null) {
        return null;
    }
    for (me.dibber.blablablapp.core.Post.Comment c : posts.get(postId).comments) {
        if ((c.id) == commentId) {
            return c.date;
        }
    }
    return null;
}