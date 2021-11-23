protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpSession authSession = request.getSession(false);
    if ((authSession != null) && ((authSession.getAttribute("email")) != null)) {
        authSession.invalidate();
        response.sendRedirect("./");
        return ;
    }else {
        response.sendRedirect("./");
        return ;
    }
}