public java.lang.String myFriendsAction() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.util.Map session = com.opensymphony.xwork2.ActionContext.getContext().getSession();
    user = ((com.cocome.DAO.User) (session.get("user")));
    com.cocome.DAO.FriendsDAOImpl friendsDAO = new com.cocome.DAO.FriendsDAOImpl();
    friends = friendsDAO.getFriendsOfUser(user.getUser_id());
    return SUCCESS;
}