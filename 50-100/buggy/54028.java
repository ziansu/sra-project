public org.sbolstandard.core2.Collection createCollection(java.lang.String URIprefix, java.lang.String displayId, java.lang.String version) throws org.sbolstandard.core2.SBOLValidationException {
    checkReadOnly();
    URIprefix = org.sbolstandard.core2.URIcompliance.checkURIprefix(URIprefix);
    org.sbolstandard.core2.URIcompliance.validateIdVersion(displayId, version);
    org.sbolstandard.core2.Collection c = createCollection(org.sbolstandard.core2.URIcompliance.createCompliantURI(URIprefix, TopLevel.COLLECTION, displayId, version, typesInURIs));
    c.setDisplayId(displayId);
    c.setPersistentIdentity(org.sbolstandard.core2.URIcompliance.createCompliantURI(URIprefix, TopLevel.COLLECTION, displayId, "", typesInURIs));
    c.setVersion(version);
    return c;
}