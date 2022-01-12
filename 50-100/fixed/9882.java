private boolean isOwnProfile(javax.faces.context.FacesContext fctx) {
    if (fctx.getViewRoot().getViewId().endsWith("profile.xhtml")) {
        int userID = java.lang.Integer.parseInt(javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("userID"));
        if ((sessionUser.getUserID()) == userID) {
            return true;
        }
    }
    return false;
}