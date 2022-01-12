public java.lang.String friendsNotificationAction() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.util.Map session = com.opensymphony.xwork2.ActionContext.getContext().getSession();
    user = ((com.cocome.DAO.User) (session.get("user")));
    com.cocome.DAO.FriendRequestsDAOImpl friendRequestsDAO = new com.cocome.DAO.FriendRequestsDAOImpl();
    friendRequests = friendRequestsDAO.getFriendRequestsForUser(user.getUser_id());
    java.lang.System.out.println("Newsfeed of the given user");
    return SUCCESS;
}