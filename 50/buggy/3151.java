public java.lang.String logout() {
    javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    userId = dv512.model.User.UNKNOWN_ID;
    profile = null;
    timeZone = null;
    lastNotificationCountUpdateTime = 0;
    notificationCount = 0;
    return dv512.UserSession.ACTION_LOGOUT;
}