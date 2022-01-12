@org.springframework.web.bind.annotation.RequestMapping(value = "${jwt.route.authentication.refresh}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<?> refreshAndGetAuthenticationToken(javax.servlet.http.HttpServletRequest request) {
    java.lang.String token = request.getHeader(tokenHeader);
    java.lang.String username = jwtTokenUtil.getUsernameFromToken(token);
    org.springframework.security.core.userdetails.UserDetails user = userDetailsService.loadUserByUsername(username);
    return org.springframework.http.ResponseEntity.ok(jwtTokenUtil.refreshToken(token));
}