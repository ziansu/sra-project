@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = true)
public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(java.lang.String name) throws org.springframework.security.core.userdetails.UsernameNotFoundException {
    biz.models.Credential credential = credentialDAO.findByUserLoginAndEnable(name, true);
    if (credential == null) {
        throw new org.springframework.security.core.userdetails.UsernameNotFoundException((("User with name = " + name) + " wasn't found"));
    }
    java.lang.System.out.println(("The following user was taken: " + credential));
    java.util.List<org.springframework.security.core.GrantedAuthority> authorities = buildUserAuthority(credential.getPerson().getRole());
    return buildUserForAuthentication(credential, authorities);
}