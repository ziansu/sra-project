@org.springframework.web.bind.annotation.RequestMapping(value = "/user/{id}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<com.fabricetas.model.User> deleteUser(@org.springframework.web.bind.annotation.PathVariable(value = "id")
long id) {
    java.lang.System.out.println(("Fetching & Deleting User with id " + id));
    com.fabricetas.model.User user = userDao.get(java.lang.Integer.parseInt((id + "")));
    if (user == null) {
        java.lang.System.out.println((("Unable to delete. User with id " + id) + " not found"));
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NOT_FOUND);
    }
    userDao.delete(java.lang.Integer.parseInt((id + "")));
    return new org.springframework.http.ResponseEntity<com.fabricetas.model.User>(org.springframework.http.HttpStatus.OK);
}