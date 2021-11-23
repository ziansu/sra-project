@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(java.lang.String name) throws org.springframework.security.core.userdetails.UsernameNotFoundException {
    final java.lang.Iterable<biz.models.Person> all = personDAO.findAll();
    biz.models.Credential credential = credentialDAO.findByUserLoginAndEnable(name, true);
    if (credential == null) {
        throw new org.springframework.security.core.userdetails.UsernameNotFoundException((("User with name = " + name) + " wasn't found"));
    }
    java.lang.System.out.println(("The following user was taken: " + credential));
    java.util.List<org.springframework.security.core.GrantedAuthority> authorities = buildUserAuthority(credential.getPerson().getRole());
    return buildUserForAuthentication(credential, authorities);
}