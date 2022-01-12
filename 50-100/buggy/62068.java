@org.springframework.web.bind.annotation.RequestMapping(value = "/getsingleuser/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<com.lognsys.model.Users> getUser(@org.springframework.web.bind.annotation.PathVariable(value = "id")
int id) {
    java.lang.System.out.println(("Fetching User with id " + id));
    com.lognsys.model.Users users = userService.getUserWithRoleAndGroup(id);
    if (users == null) {
        java.lang.System.out.println((("User with id " + id) + " not found"));
        return new org.springframework.http.ResponseEntity<com.lognsys.model.Users>(org.springframework.http.HttpStatus.NOT_FOUND);
    }
    return new org.springframework.http.ResponseEntity<com.lognsys.model.Users>(users, org.springframework.http.HttpStatus.OK);
}