protected void doGet(com.processing.HttpServletRequest request, com.processing.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.System.out.println("OP doGet UsersTable");
    try {
        java.lang.String s = "test message";
        executeQuery();
        javax.servlet.RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/all_users_table.jsp");
        request.setAttribute("usersList", usersList);
        request.setAttribute("tm", s);
        dispatcher.forward(request, response);
    } catch (java.lang.Exception e) {
        javax.servlet.RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/corporate.jsp");
        dispatcher.forward(request, response);
    }
}