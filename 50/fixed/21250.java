public void addComment(java.lang.String message, java.lang.String commentBy) {
    this.comments.add(0, new edu.caltech.cs141b.collaborator.server.data.CommentData(message, commentBy));
}