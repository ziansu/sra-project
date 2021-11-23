public void doIt(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String error = null;
    if (error != null) {
        response.sendRedirect(("home.do?error=" + error));
    }else {
        response.sendRedirect("home.do");
    }
}