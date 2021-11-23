public java.lang.String timelineAction() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.util.Map session = com.opensymphony.xwork2.ActionContext.getContext().getSession();
    com.cocome.DAO.User user = ((com.cocome.DAO.User) (session.get("user")));
    java.lang.System.out.println(user.getUser_id());
    com.cocome.DAO.PostsDAOImpl postsDAO = new com.cocome.DAO.PostsDAOImpl();
    posts = postsDAO.getPostsOfUser(user.getUser_id());
    java.lang.System.out.println("Posts of the given user");
    for (com.cocome.DAO.Posts q : posts) {
        java.lang.System.out.println(q.getPost_id());
    }
    return SUCCESS;
}