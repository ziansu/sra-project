@org.springframework.web.bind.annotation.RequestMapping(path = "register", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity register(@org.springframework.web.bind.annotation.RequestBody
com.github.olegbal.urlshortingtool.domain.dto.LoginAndPasswordDto loginAndPasswordDto) {
    if (userService.createUser(loginAndPasswordDto)) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.OK);
    }
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NOT_ACCEPTABLE);
}