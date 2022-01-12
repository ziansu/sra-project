@db_project.controllers.RequestMapping(value = "/profile", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public final org.springframework.http.ResponseEntity<db_project.models.UserModel> viewProfile(@db_project.controllers.PathVariable(value = "nickname")
java.lang.String nickname) {
    java.util.List<db_project.models.UserModel> users;
    try {
        users = service.getUserFromDb(new db_project.models.UserModel(null, null, null, nickname));
        if (users.isEmpty()) {
            throw new org.springframework.dao.EmptyResultDataAccessException(0);
        }
    } catch (org.springframework.dao.DataAccessException ex) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NOT_FOUND);
    }
    return new org.springframework.http.ResponseEntity(users.get(0), org.springframework.http.HttpStatus.OK);
}