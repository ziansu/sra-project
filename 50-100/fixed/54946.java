public static com.pratilipi.data.client.CommentData createCommentData(com.pratilipi.data.type.CommentDoc commentDoc) {
    com.pratilipi.data.client.CommentData commentData = new com.pratilipi.data.client.CommentData(commentDoc.getId());
    commentData.setUserId(commentDoc.getUserId());
    commentData.setContent(commentDoc.getContent());
    commentData.setState(CommentState.ACTIVE);
    commentData.setCreationDate(commentDoc.getCreationDate());
    commentData.setLastUpdated(commentDoc.getLastUpdated());
    commentData.setAccessToUpdate(com.pratilipi.data.util.CommentDataUtil.hasAccessToUpdateCommentData(CommentState.ACTIVE, commentDoc.getUserId()));
    return commentData;
}