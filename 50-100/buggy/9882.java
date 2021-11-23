private boolean isOwnProfile(javax.faces.context.FacesContext fctx, java.lang.String role) {
    boolean ownProfile = true;
    if ((fctx.getViewRoot().getViewId().endsWith("profile.xhtml")) && (!(role.equals("SYSTEM_ADMINISTRATOR")))) {
        int userID = java.lang.Integer.parseInt(javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("userID"));
        if ((sessionUser.getUserID()) != userID) {
            ownProfile = false;
        }
    }
    return ownProfile;
}