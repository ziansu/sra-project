protected void addComment(int id, java.lang.String comment) {
    try {
        is.createComment(repo, id, comment.substring(0, java.lang.Math.min(comment.length(), 262144)));
    } catch (java.io.IOException e) {
        org.apache.flink.tooling.App.LOG.warn("Error adding comment", e);
    }
}