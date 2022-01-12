public java.lang.String logout() {
    java.lang.String result = "/index.xhtml?faces-redirect=true";
    try {
        javax.faces.context.FacesContext context = javax.faces.context.FacesContext.getCurrentInstance();
        javax.servlet.http.HttpServletRequest request = ((javax.servlet.http.HttpServletRequest) (context.getExternalContext().getRequest()));
        request.logout();
        javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    } catch (javax.servlet.ServletException e) {
        java.util.logging.Logger.getLogger(ru.smoomrik.LibraryJSF.beans.User.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
    }
    return result;
}