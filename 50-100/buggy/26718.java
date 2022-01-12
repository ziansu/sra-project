@java.lang.Override
public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(java.lang.String username) throws org.springframework.security.core.userdetails.UsernameNotFoundException {
    com.mycompany.karttagalleria.domain.Account user = userRepository.findByUsername(username);
    if (user == null) {
        throw new org.springframework.security.core.userdetails.UsernameNotFoundException(("No such user: " + username));
    }
    return new com.mycompany.karttagalleria.service.User(user.getUsername(), user.getPassword(), true, true, true, true, java.util.Arrays.asList(new org.springframework.security.core.authority.SimpleGrantedAuthority(user.getRole().toString())));
}