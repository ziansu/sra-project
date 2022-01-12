public com.cityelf.exceptions.Status confirmRegistration(long id, java.lang.String email) {
    com.cityelf.model.User user = userRepository.findByEmail(email);
    if ((user.getId()) == id) {
        user.setActivated(true);
        userRepository.save(user);
        java.util.Set<com.cityelf.model.UserRole> userRoles = roleService.getUserRoles(id);
        userRoles.add(new com.cityelf.model.UserRole(id, com.cityelf.model.Role.AUTHORIZED_ROLE));
        roleService.save(userRoles);
        return com.cityelf.exceptions.Status.EMAIL_CONFIRMED;
    }
    return com.cityelf.exceptions.Status.EMAIL_NOT_CONFIRMED;
}