public void userLogout(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    javax.servlet.http.HttpSession session = request.getSession(false);
    if (session != null) {
        session.getId();
        session.invalidate();
        try {
            response.sendRedirect("./pages/Login.jsp");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}