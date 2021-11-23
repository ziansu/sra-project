@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String jsp = "/buc";
    javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher(jsp);
    dispatcher.forward(request, response);
}