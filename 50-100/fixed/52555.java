@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('ROLE_USER')")
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "application/json")
public org.springframework.http.ResponseEntity<java.util.List<org.openbox.sf5.model.Settings>> getSettingsByUserLogin() throws org.openbox.sf5.json.exceptions.NotAuthenticatedException {
    org.openbox.sf5.model.Users currentUser = securityContext.getCurrentlyAuthenticatedUser();
    if (currentUser == null) {
        throw new org.openbox.sf5.json.exceptions.NotAuthenticatedException("Couldn't get currently authenticated user!");
    }
    java.util.List<org.openbox.sf5.model.Settings> settList = settingsJsonizer.getSettingsByUser(currentUser);
    if (settList.isEmpty()) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NO_CONTENT);
    }
    return new org.springframework.http.ResponseEntity(settList, org.springframework.http.HttpStatus.OK);
}