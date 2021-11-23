public java.lang.String newsfeedAction() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.util.Map session = com.opensymphony.xwork2.ActionContext.getContext().getSession();
    user = ((com.cocome.DAO.User) (session.get("user")));
    com.cocome.DAO.NewsfeedDAOImpl newsfeedDAO = new com.cocome.DAO.NewsfeedDAOImpl();
    newsfeeds = newsfeedDAO.getNewsfeedOfUser(user.getUser_id());
    java.lang.System.out.println("Newsfeed of the given user");
    for (com.cocome.DAO.Newsfeed q : newsfeeds) {
        java.lang.System.out.println(q.getPosted_by());
        java.lang.System.out.println(q.getContent());
    }
    return SUCCESS;
}