public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(java.lang.String email) throws org.springframework.security.core.userdetails.UsernameNotFoundException {
    podcastnet.persistence.model.User user = userRepository.findByEmail(email);
    if (user == null) {
        throw new org.springframework.security.core.userdetails.UsernameNotFoundException(("No user found with username: " + email));
    }
    boolean enabled = true;
    boolean accountNonExpired = true;
    boolean credentialsNonExpired = true;
    boolean accountNonLocked = true;
    return new podcastnet.persistence.model.User(user.getEmail(), user.getPassword().toLowerCase(), enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, getAuthorities(user.getRoles()));
}