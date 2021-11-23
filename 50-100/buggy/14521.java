@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity<java.lang.String> login(@org.springframework.web.bind.annotation.RequestBody
com.stonedrum.dto.AuthRequestDto auth) {
    if (securityService.authenticate(auth.getUsername(), auth.getPassword())) {
        return org.springframework.http.ResponseEntity.ok((("User logged in: " + (securityService.findLoggedInUsername())) + ")"));
    }else {
        return org.springframework.http.ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Authentication failed.");
    }
}