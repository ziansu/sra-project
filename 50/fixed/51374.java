@org.springframework.security.access.prepost.PostAuthorize(value = "@userPreAuthorizeService.checkRightsToUrlByUsername(#request,#userName)")
@org.springframework.web.bind.annotation.RequestMapping(path = "/api/v1/account", params = "userName", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity getUserDetails(javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.RequestParam(value = "userName")
java.lang.String userName) {
    return new org.springframework.http.ResponseEntity(userService.getUserByLogin(userName), org.springframework.http.HttpStatus.OK);
}