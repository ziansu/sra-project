@java.lang.Override
protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpSession session = request.getSession();
    session.setAttribute("bookId", request.getParameter("bookId"));
    session.setAttribute("cardNumber", request.getParameter("cardNumber"));
    response.sendRedirect("lend-confirm");
}