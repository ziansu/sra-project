@com.cyclic.controllers.RequestMapping(method = RequestMethod.GET, produces = "application/json")
public org.springframework.http.ResponseEntity getUser(javax.servlet.http.HttpSession httpSession) {
    if ((httpSession.getAttribute("userId")) == null) {
        return org.springframework.http.ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new com.cyclic.models.Status("user not authorized"));
    }
    return org.springframework.http.ResponseEntity.ok(accountService.getUserById(((java.lang.Long) (httpSession.getAttribute("userId")))).toView());
}