private java.lang.String generateId(java.lang.String shortName) throws java.io.IOException {
    java.lang.String id = shortName.replaceAll("\\W", "");
    try {
        org.georchestra.ldapadmin.dto.Org sameId = this.orgDao.findByCommonName(id);
        throw new java.io.IOException(("Identifier already used : " + id));
    } catch (org.springframework.ldap.NameNotFoundException ex) {
    }
    return id;
}