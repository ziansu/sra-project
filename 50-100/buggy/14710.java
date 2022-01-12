@java.lang.Override
public void setManager(java.lang.String manager) {
    if (manager != null) {
        try {
            javax.naming.ldap.LdapName dn = new javax.naming.ldap.LdapName(manager);
            this.manager = dn.getRdn(((dn.size()) - 1)).getValue().toString();
        } catch (javax.naming.InvalidNameException e) {
            this.manager = manager;
        }
    }
}