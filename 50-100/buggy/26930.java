public void initializeVariables() {
    sessionUser = new com.hersa.sample.project.dao.user.User();
    javax.servlet.http.HttpSession session = ((javax.servlet.http.HttpSession) (javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getSession(false)));
    sessionUser = ((com.hersa.sample.project.dao.user.User) (session.getAttribute("User")));
    allUsersList = new java.util.ArrayList<com.hersa.sample.project.dao.user.User>();
    userRoleMap = new java.util.HashMap<java.lang.String, java.lang.String>();
}