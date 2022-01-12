public boolean checkLogin() {
    try {
        EntityManager.Staff staff = ((EntityManager.Staff) (session.getAttribute("staff")));
        if (staff == null) {
            return false;
        }else {
            if (staff.getIsAdmin()) {
                isAdmin = true;
                loggedInStaffID = staff.getId();
            }
            return true;
        }
    } catch (java.lang.Exception ex) {
        return false;
    }
}