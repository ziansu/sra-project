@org.junit.Test
public void whenSearchingMoreThan1000UsersThenReturnAllUsers() throws java.lang.Exception {
    javax.naming.ldap.LdapContext ldapContext = getValidContext();
    java.lang.String ouWith3001Users = "OU=Departement1,OU=doculibre,DC=test,DC=doculibre,DC=ca";
    java.util.List<java.lang.String> users = new com.constellio.model.conf.ldap.services.LDAPServicesImpl().searchUsersIdsFromContext(LDAPDirectoryType.ACTIVE_DIRECTORY, ldapContext, ouWith3001Users);
    org.assertj.core.api.Assertions.assertThat(users.size()).isEqualTo(3001);
}