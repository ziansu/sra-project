@java.lang.Override
public java.lang.String execute(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res) throws com.epam.as.bookhotel.exception.ConnectionPoolException, com.epam.as.bookhotel.exception.JdbcDaoException, com.epam.as.bookhotel.exception.PropertyManagerException, com.epam.as.bookhotel.exception.ValidatorException {
    com.epam.as.bookhotel.model.User user = ((com.epam.as.bookhotel.model.User) (req.getSession().getAttribute(com.epam.as.bookhotel.action.LogoutAction.USER_SESSION_ATTRIBUTE_NAME)));
    com.epam.as.bookhotel.action.LogoutAction.logger.debug("User with id=\"{}\" and login=\"{}\" logout now.", user.getId(), user.getLogin());
    req.getSession().invalidate();
    return com.epam.as.bookhotel.action.LogoutAction.INDEX_JSP;
}