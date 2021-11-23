protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String status = request.getParameter("status");
    int orderID = java.lang.Integer.parseInt(request.getParameter("orderID"));
    updateStatus(orderID, status);
    java.lang.String url = "/viewOrder.jsp";
    javax.servlet.RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
    dispatcher.forward(request, response);
}