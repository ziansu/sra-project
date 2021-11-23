public void addApplicationSelectorEntry(org.gluu.asimba.util.ldap.selector.ApplicationSelectorEntry entry) {
    org.gluu.asimba.util.ldap.selector.LDAPApplicationSelectorEntry ldapEntry = new org.gluu.asimba.util.ldap.selector.LDAPApplicationSelectorEntry();
    ldapEntry.setEntry(entry);
    java.lang.String inum = generateInumImpl();
    ldapEntry.setInum(inum);
    ldapEntry.setDn(getDnForLDAPApplicationSelectorEntry(inum));
    ldapEntryManager.persist(ldapEntry);
}