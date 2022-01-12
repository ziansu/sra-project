public void save(java.lang.Object object) throws org.openthinclient.ldap.DirectoryException {
    assertInitialized();
    mapping.save(object, null);
    mapping.refresh(object);
}