@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('ROLE_USER')")
@org.springframework.web.bind.annotation.RequestMapping(value = "all", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<org.openbox.sf5.model.Settings> getSettingsByUserLogin() {
    java.lang.System.out.println("Request all user settings called");
    org.openbox.sf5.model.Users currentUser = securityContext.getCurrentlyAuthenticatedUser();
    if (currentUser == null) {
        return new java.util.ArrayList<org.openbox.sf5.model.Settings>();
    }
    java.util.List<org.openbox.sf5.model.Settings> settList = settingsJsonizer.getSettingsByUser(currentUser);
    return settList;
}