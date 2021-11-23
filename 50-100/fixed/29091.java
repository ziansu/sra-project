protected org.springframework.security.core.userdetails.UserDetails createUserDetails(java.lang.String username, org.springframework.security.core.userdetails.UserDetails userFromUserQuery, java.util.List<org.springframework.security.core.GrantedAuthority> combinedAuthorities) {
    java.lang.String returnUsername = userFromUserQuery.getUsername();
    if (!(isUsernameBasedPrimaryKey())) {
        returnUsername = username;
    }
    return new org.springframework.security.core.userdetails.User(returnUsername, userFromUserQuery.getPassword(), userFromUserQuery.isEnabled(), true, true, true, combinedAuthorities);
}