@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('ROLE_USER')")
@org.springframework.web.bind.annotation.RequestMapping(value = "filter/id/{settingId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<org.openbox.sf5.model.Settings> getSettingById(@org.springframework.web.bind.annotation.PathVariable(value = "settingId")
long settingId) throws org.openbox.sf5.json.exceptions.NotAuthenticatedException {
    org.openbox.sf5.model.Users currentUser = securityContext.getCurrentlyAuthenticatedUser();
    if (currentUser == null) {
        throw new org.openbox.sf5.json.exceptions.NotAuthenticatedException("Couldn't get currently authenticated user!");
    }
    org.openbox.sf5.model.Settings setting = settingsJsonizer.getSettingById(settingId, currentUser);
    if (setting == null) {
        return new org.springframework.http.ResponseEntity<org.openbox.sf5.model.Settings>(org.springframework.http.HttpStatus.NO_CONTENT);
    }
    return new org.springframework.http.ResponseEntity<org.openbox.sf5.model.Settings>(setting, org.springframework.http.HttpStatus.OK);
}