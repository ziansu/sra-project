protected void addComment(int id, java.lang.String comment) {
    try {
        is.createComment(user, repo.getName(), id, comment.substring(0, java.lang.Math.min(comment.length(), 262144)));
    } catch (java.io.IOException e) {
        org.apache.flink.tooling.App.LOG.warn("Error adding comment", e);
    }
}