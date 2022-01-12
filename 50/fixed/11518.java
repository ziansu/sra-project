public entities.User getLoggedUser() {
    java.lang.String remoteUser = javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
    if (remoteUser != null) {
        current = ejbFacade.findUserByEmail(remoteUser);
    }
    return current;
}