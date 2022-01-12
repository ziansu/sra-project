protected void doGet(com.processing.HttpServletRequest request, com.processing.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.System.out.println("OP doGet UsersTable");
    java.lang.String s = "test message";
    executeQuery();
    javax.servlet.RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/all_users_table.jsp");
    request.setAttribute("usersList", usersList);
    request.setAttribute("tm", s);
    dispatcher.forward(request, response);
}