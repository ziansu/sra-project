@java.lang.Override
public java.lang.String executeCommand(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String page;
    java.lang.Integer idForFind = java.lang.Integer.valueOf(request.getParameter("id"));
    com.gmail.jackkobec.internetshop.persistence.connection.pool.ConnectionManager connectionManager = com.gmail.jackkobec.internetshop.persistence.connection.pool.ConnectionManager.getConnectionManagerFromJNDI();
    page = "/WEB-INF/pages/user-info.jsp";
    com.gmail.jackkobec.internetshop.commands.UserInfoCommand.LOGGER.info("UserInfoCommand");
    return page;
}