@java.lang.Override
public java.lang.String executeCommand(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String page;
    java.lang.Integer idForFind = java.lang.Integer.valueOf(request.getParameter("id"));
    com.gmail.jackkobec.internetshop.persistence.connection.pool.ConnectionManager connectionManager = com.gmail.jackkobec.internetshop.persistence.connection.pool.ConnectionManager.getConnectionManagerFromJNDI();
    com.gmail.jackkobec.internetshop.persistence.model.User finded = new com.gmail.jackkobec.internetshop.persistence.dao.jdbc.impl.UserDaoImpl(connectionManager).getOneByID(idForFind);
    request.setAttribute("user", finded);
    page = "/WEB-INF/pages/user-info.jsp";
    java.lang.System.out.println(finded);
    com.gmail.jackkobec.internetshop.commands.UserInfoCommand.LOGGER.info("UserInfoCommand");
    return page;
}