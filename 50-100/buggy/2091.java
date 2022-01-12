public void addIDPEntry(org.gluu.asimba.util.ldap.idp.IDPEntry entry) {
    log.info("addIDPEntry() call");
    try {
        org.gluu.asimba.util.ldap.idp.LdapIDPEntry ldapEntry = new org.gluu.asimba.util.ldap.idp.LdapIDPEntry();
        java.lang.String inum = generateInumImpl();
        ldapEntry.setInum(inum);
        ldapEntry.setDn(getDnForLdapIDPEntry(inum));
        ldapEntry.setEntry(entry);
        ldapEntryManager.persist(ldapEntry);
    } catch (java.lang.Exception e) {
        log.error("addIDPEntry() exception", e);
    }
}