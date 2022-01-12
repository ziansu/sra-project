public boolean checkLogin(javax.servlet.http.HttpServletResponse response) {
    try {
        EntityManager.Staff staff = ((EntityManager.Staff) (session.getAttribute("staff")));
        if (staff == null) {
            response.sendRedirect("index.jsp?errMsg=Session Expired.");
            return false;
        }else {
            return true;
        }
    } catch (java.lang.Exception ex) {
        return false;
    }
}