@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('ROLE_ADMIN')")
@com.example.tech9_survey.controller.PutMapping(path = "/block/{user_id}")
public com.example.tech9_survey.controller.ResponseEntity<java.lang.Object> changeStatus(@com.example.tech9_survey.controller.PathVariable(value = "user_id")
java.lang.Long userId) {
    com.example.tech9_survey.domain.User foundUser = userService.findOne(userId);
    if (foundUser == null) {
        return new com.example.tech9_survey.controller.ResponseEntity(HttpStatus.NOT_FOUND);
    }
    foundUser.setUserStatus(resolveStatus(foundUser));
    for (com.example.tech9_survey.domain.UserRole role : foundUser.getRoles()) {
        if (role.getType().equals(UserRole.RoleType.ROLE_ADMIN)) {
            return new com.example.tech9_survey.controller.ResponseEntity(HttpStatus.FORBIDDEN);
        }
    }
    userService.save(foundUser);
    return new com.example.tech9_survey.controller.ResponseEntity(HttpStatus.OK);
}