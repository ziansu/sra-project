public java.lang.String execute() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    com.cocome.DAO.LoginDAOImpl loginDAO = new com.cocome.DAO.LoginDAOImpl();
    if (loginDAO.validateUser(login)) {
        com.cocome.DAO.UserDAOImpl userDAO = new com.cocome.DAO.UserDAOImpl();
        com.cocome.DAO.User user = userDAO.getUserDetails(login.getUser_id());
        setName(user.getFirst_name());
        java.util.Map session = com.opensymphony.xwork2.ActionContext.getContext().getSession();
        session.put("user", user);
        return SUCCESS;
    }
    return ERROR;
}