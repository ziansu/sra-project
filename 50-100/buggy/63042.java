@pandora.clone.controller.GetMapping(value = "/user/{id}")
public pandora.clone.models.User getUser(@pandora.clone.controller.PathVariable
long id, javax.servlet.http.HttpServletRequest request) {
    java.lang.String token = request.getHeader(tokenHeader);
    pandora.clone.authorization.JwtTokenUtil jwtTokenUtil = new pandora.clone.authorization.JwtTokenUtil();
    jwtTokenUtil.parseJWT(token);
    java.lang.System.out.println(jwtTokenUtil.getUsernameFromToken(token));
    return new pandora.clone.models.User("user", "password", "email");
}