@java.lang.Override
public void addRole(java.lang.String username, java.lang.String rolename) {
    if (!(rolename.matches(Role.ROLE_PATTERN)))
        throwException(new it.greenvulcano.gvesb.iam.exception.InvalidRoleException(rolename));
    
    it.greenvulcano.gvesb.iam.domain.User user = userRepository.get(username).orElseThrow(() -> new java.lang.SecurityException(new it.greenvulcano.gvesb.iam.exception.UserNotFoundException(username)));
    it.greenvulcano.gvesb.iam.domain.Role role = roleRepository.get(username).orElse(new it.greenvulcano.gvesb.iam.domain.Role(rolename, "Created by JAAS"));
    user.getRoles().add(role);
    userRepository.add(user);
}