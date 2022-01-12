@com.teleshovivan.controller.RequestMapping(value = "/{id}", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<com.teleshovivan.model.User> getById(@com.teleshovivan.controller.PathVariable
int id) {
    com.teleshovivan.model.User user = service.get(id);
    return new org.springframework.http.ResponseEntity(user, org.springframework.http.HttpStatus.OK);
}