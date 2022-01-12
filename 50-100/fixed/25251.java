public boolean checkLogin(javax.servlet.http.HttpServletResponse response) {
    try {
        EntityManager.Staff staff = ((EntityManager.Staff) (session.getAttribute("staff")));
        if (staff == null) {
            return false;
        }else {
            return true;
        }
    } catch (java.lang.Exception ex) {
        return false;
    }
}