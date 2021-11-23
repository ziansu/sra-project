@java.lang.Override
public gitmad.bitter.model.Comment getComment(java.lang.String commentId) {
    gitmad.bitter.data.firebase.FirebaseSyncRequester<gitmad.bitter.model.Comment> commentRequester = newFirebaseSyncRequesterForComment(commentId);
    if (!(commentRequester.exists())) {
        throw new java.lang.IllegalArgumentException("Comment does not exist");
    }
    return commentRequester.get();
}