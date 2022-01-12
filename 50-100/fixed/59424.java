protected void processRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    super.doPost(request, response);
    try {
        this.invalidateSession();
        this.clearCookies();
    } catch (java.lang.NullPointerException noCookie) {
    }
    response.sendRedirect("login.jsp");
}