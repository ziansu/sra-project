public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(java.lang.String username) throws org.springframework.security.core.userdetails.UsernameNotFoundException {
    try {
        twitter.beans.User user = userService.getUserByUsername(username);
        if (user == null) {
            throw new org.springframework.security.core.userdetails.UsernameNotFoundException(("Username does not exist: " + username));
        }
        return new twitter.beans.User(user.getUsername(), user.getPassword(), true, true, true, true, getAuthorities(java.util.Arrays.asList(user.getRole())));
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}