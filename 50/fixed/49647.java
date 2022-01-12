private org.apache.roller.weblogger.ui.core.menu.Menu getMenu(org.apache.roller.weblogger.pojos.User user, java.lang.String actionName, org.apache.roller.weblogger.pojos.WeblogRole requiredRole) {
    return menuHelper.getMenu(user.getGlobalRole(), requiredRole, actionName, false);
}