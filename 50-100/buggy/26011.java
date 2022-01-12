@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('ROLE_ADMIN')")
@com.example.tech9_survey.controller.DeleteMapping(path = "/{id}")
public com.example.tech9_survey.controller.ResponseEntity deleteUser(@com.example.tech9_survey.controller.PathVariable
java.lang.Long id) {
    com.example.tech9_survey.domain.User foundUser = userService.findOne(id);
    for (com.example.tech9_survey.domain.UserRole role : foundUser.getRoles()) {
        if (role.getType().equals(UserRole.RoleType.ROLE_ADMIN)) {
            return new com.example.tech9_survey.controller.ResponseEntity(HttpStatus.FORBIDDEN);
        }
    }
    commentService.deleteByUser(foundUser.getUsername());
    userService.delete(id);
    return new com.example.tech9_survey.controller.ResponseEntity(HttpStatus.OK);
}