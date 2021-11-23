@java.lang.Override
public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    response.setContentType("text/html");
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    this.getFlash(request);
    request.getRequestDispatcher("/WEB-INF/main.jsp").forward(request, response);
}