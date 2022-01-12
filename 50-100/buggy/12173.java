public java.util.List<model.Comments> getComments() {
    java.util.List<model.Comments> commentsList;
    try {
        java.lang.String query = java.lang.String.format("SELECT c FROM %s AS c ", model.Comments.class.getName());
        commentsList = em.createQuery(query, model.Comments.class).getResultList();
        return commentsList;
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Szar van a palacsintában");
        e.printStackTrace();
    }
    return null;
}