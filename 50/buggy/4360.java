@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = "/findUser")
public org.springframework.http.ResponseEntity<?> findUser(java.lang.String userId) {
    ldap.sample.domain.User user = iposRepository.findUser(userId);
    return new org.springframework.http.ResponseEntity<ldap.sample.domain.User>(user, org.springframework.http.HttpStatus.FOUND);
}