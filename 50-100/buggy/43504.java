@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('ROLE_ADMIN') or (#login  == authentication.name)")
@org.springframework.web.bind.annotation.RequestMapping(value = "filter/username/{login}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<org.openbox.sf5.model.Users> getUserByLogin(@org.springframework.web.bind.annotation.PathVariable(value = "login")
java.lang.String login) {
    org.openbox.sf5.model.Users retUser = null;
    try {
        retUser = usersJsonizer.getUserByLogin(login);
    } catch (java.lang.Exception e) {
        throw new java.lang.IllegalStateException("Error getting user from database!", e);
    }
    if (retUser == null) {
        throw new java.lang.IllegalArgumentException(("No user found in database for login: " + login));
    }
    return new org.springframework.http.ResponseEntity<org.openbox.sf5.model.Users>(retUser, org.springframework.http.HttpStatus.OK);
}