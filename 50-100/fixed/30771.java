public java.util.List<model.Comments> getCommentsById(int id) {
    java.util.List<model.Comments> commentsList;
    try {
        java.lang.String query = java.lang.String.format(("SELECT c FROM %s AS c WHERE news_id = " + id), model.Comments.class.getName());
        commentsList = em.createQuery(query, model.Comments.class).getResultList();
        return commentsList;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}