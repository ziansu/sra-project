@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('ROLE_USER')")
@org.springframework.web.bind.annotation.RequestMapping(value = "all", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "application/json")
public org.springframework.http.ResponseEntity<java.util.List<org.openbox.sf5.model.Settings>> getSettingsByUserLogin() {
    java.lang.System.out.println("Request all user settings called");
    org.openbox.sf5.model.Users currentUser = securityContext.getCurrentlyAuthenticatedUser();
    if (currentUser == null) {
        return new org.springframework.http.ResponseEntity<java.util.List<org.openbox.sf5.model.Settings>>(org.springframework.http.HttpStatus.UNAUTHORIZED);
    }
    java.util.List<org.openbox.sf5.model.Settings> settList = settingsJsonizer.getSettingsByUser(currentUser);
    if (settList.isEmpty()) {
        return new org.springframework.http.ResponseEntity<java.util.List<org.openbox.sf5.model.Settings>>(org.springframework.http.HttpStatus.NO_CONTENT);
    }
    return new org.springframework.http.ResponseEntity<java.util.List<org.openbox.sf5.model.Settings>>(settList, org.springframework.http.HttpStatus.OK);
}