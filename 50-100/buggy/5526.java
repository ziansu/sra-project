@java.lang.Override
public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(final java.lang.String username) throws org.springframework.security.core.userdetails.UsernameNotFoundException {
    hu.schonherz.administration.serviceapi.dto.UserDTO user;
    try {
        user = userService.findUserByName(username);
        if (user == null) {
            throw new org.springframework.security.core.userdetails.UsernameNotFoundException(username);
        }
        java.util.List<org.springframework.security.core.GrantedAuthority> authorities = buildUserAuthority(user.getRoles());
        return buildUserForAuthentication(user, authorities);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw new org.springframework.security.core.userdetails.UsernameNotFoundException(e.getMessage());
    }
}