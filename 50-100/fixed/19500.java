public boolean registerNewUser(com.locker.model.User user) {
    if (usernameExists(user.getUsername())) {
        com.locker.service.UserService.logger.error(("Username was already found in database: " + (user.getUsername())));
        return false;
    }
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    user.setEnabled(1);
    userRepository.save(user);
    com.locker.model.UserRole userRole = new com.locker.model.UserRole(user.getUsername(), "USER");
    userRoleRepository.save(userRole);
    return true;
}