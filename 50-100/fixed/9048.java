public static void forward(java.lang.String url, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    javax.servlet.RequestDispatcher rd = request.getRequestDispatcher(url);
    try {
        rd.forward(request, response);
    } catch (javax.servlet.ServletException | java.io.IOException e) {
        Servlet.Commands.LOG.error(e);
    }
}