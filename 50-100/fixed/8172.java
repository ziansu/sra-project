@org.springframework.web.bind.annotation.RequestMapping
public org.springframework.http.ResponseEntity<com.wmanual.jpa.domain.User> check(@org.springframework.web.bind.annotation.RequestParam(value = "uname")
java.lang.String uname) throws java.lang.Exception {
    com.wmanual.jpa.domain.User user = userRepository.findByUsername(uname);
    if (user != null) {
        return new org.springframework.http.ResponseEntity<com.wmanual.jpa.domain.User>(user, org.springframework.http.HttpStatus.OK);
    }else {
        return new org.springframework.http.ResponseEntity<com.wmanual.jpa.domain.User>(org.springframework.http.HttpStatus.NOT_FOUND);
    }
}