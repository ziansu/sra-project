@org.springframework.web.bind.annotation.RequestMapping(value = "/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<com.teleshovivan.model.User> getById(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer id) {
    com.teleshovivan.model.User user = service.get(id);
    return new org.springframework.http.ResponseEntity(user, org.springframework.http.HttpStatus.OK);
}