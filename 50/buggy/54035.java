public boolean userHasRights() {
    de.uniwue.info6.webapp.admin.UserRights rights = new de.uniwue.info6.webapp.admin.UserRights().initialize();
    return rights.hasRatingRight(user, exercise);
}