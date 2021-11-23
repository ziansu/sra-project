@java.lang.Override
public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    this.getFlash(request);
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    request.getRequestDispatcher("/WEB-INF/main.jsp").forward(request, response);
}