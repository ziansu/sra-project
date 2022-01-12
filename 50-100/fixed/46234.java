@org.springframework.beans.factory.annotation.Autowired
public void configureGlobal(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    auth.ldapAuthentication().userDetailsContextMapper(new org.csiro.igsn.security.UserDetailsContextMapperImpl()).userSearchFilter("(&(sAMAccountName={0}))").groupRoleAttribute("cn").groupSearchBase("ou=Groups").groupSearchFilter("(&(member={0}))").contextSource(getLdapContextSource());
}