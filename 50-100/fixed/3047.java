@sample.controllers.RequestMapping(method = RequestMethod.DELETE, produces = "application/json")
public org.springframework.http.ResponseEntity exit(javax.servlet.http.HttpSession httpSession) {
    if ((httpSession.getAttribute("userId")) == null) {
        return org.springframework.http.ResponseEntity.ok(new sample.models.Status(sample.models.Status.ERROR_UNAUTHORIZED, "user not authorized"));
    }
    httpSession.removeAttribute("userId");
    return org.springframework.http.ResponseEntity.ok(new sample.models.Status(sample.models.Status.OK, "success exited"));
}