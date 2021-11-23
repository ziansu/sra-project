protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.System.out.println(123);
    request.getRequestDispatcher("/view/index.jsp").forward(request, response);
}