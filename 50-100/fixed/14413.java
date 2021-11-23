@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('ROLE_USER')")
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = javax.ws.rs.core.MediaType.APPLICATION_XML)
public org.springframework.http.ResponseEntity<org.openbox.sf5.model.listwrappers.GenericXMLListWrapper<org.openbox.sf5.model.Settings>> getSettingsByUserLoginXML() throws org.openbox.sf5.json.exceptions.NotAuthenticatedException {
    org.openbox.sf5.model.Users currentUser = securityContext.getCurrentlyAuthenticatedUser();
    if (currentUser == null) {
        throw new org.openbox.sf5.json.exceptions.NotAuthenticatedException("Couldn't get currently authenticated user!");
    }
    java.util.List<org.openbox.sf5.model.Settings> settList = settingsJsonizer.getSettingsByUser(currentUser);
    if (settList.isEmpty()) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NO_CONTENT);
    }
    return org.openbox.sf5.common.JsonObjectFiller.returnGenericWrapperResponseBySatList(settList, org.openbox.sf5.model.Settings.class);
}