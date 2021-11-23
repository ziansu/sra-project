public void dispatchView(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.String file) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.RequestDispatcher view = request.getRequestDispatcher(file);
    view.forward(request, response);
}