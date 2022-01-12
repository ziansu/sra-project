@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, path = "/facebook/callback", produces = "application/json")
@io.swagger.annotations.ApiOperation(value = "Success callback of login with facebook", notes = "Realizes the login in the system")
public java.lang.String loginFacebook(java.security.Principal principal, javax.servlet.http.HttpSession session) {
    return "{message : \'Logout successful\'}";
}