@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    java.util.List<models.User> users = service.getUsersWithAuto();
    req.setAttribute("Title", "Test java site page");
    req.setAttribute("User", users.get(0).getName());
    req.setAttribute("userList", users);
    req.getRequestDispatcher("index.jsp").forward(req, resp);
}