@com.mprtcz.tictactoeultimate.user.controller.RequestMapping(value = "/{ssoId}", method = RequestMethod.DELETE)
public org.springframework.http.ResponseEntity removeUser(@com.mprtcz.tictactoeultimate.user.controller.PathVariable
java.lang.String ssoId, java.security.Principal principal) {
    com.mprtcz.tictactoeultimate.user.model.User userToDelete = userService.findBySSO(ssoId);
    if (userToDelete == null) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NOT_FOUND);
    }
    if (!(userService.isAdminOrRootUser(ssoId, principal))) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.FORBIDDEN);
    }
    userService.removeUser(userToDelete.getSsoId());
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.OK);
}