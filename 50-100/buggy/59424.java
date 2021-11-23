protected void processRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    super.doPost(request, response);
    if (this.sameOrigin(request)) {
        try {
            this.invalidateSession();
            this.clearCookies();
        } catch (java.lang.NullPointerException noCookie) {
        }
        response.sendRedirect("login.jsp");
    }else {
        response.sendRedirect(servlets.ACCESS_DENIED_URL);
    }
}