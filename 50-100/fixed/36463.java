public org.sbolstandard.core2.ModuleDefinition createModuleDefinition(java.lang.String URIprefix, java.lang.String displayId, java.lang.String version) throws org.sbolstandard.core2.SBOLValidationException {
    checkReadOnly();
    URIprefix = org.sbolstandard.core2.URIcompliance.checkURIprefix(URIprefix);
    org.sbolstandard.core2.ModuleDefinition md = createModuleDefinition(org.sbolstandard.core2.URIcompliance.createCompliantURI(URIprefix, TopLevel.MODULE_DEFINITION, displayId, version, typesInURIs));
    md.setPersistentIdentity(org.sbolstandard.core2.URIcompliance.createCompliantURI(URIprefix, TopLevel.MODULE_DEFINITION, displayId, "", typesInURIs));
    md.setDisplayId(displayId);
    md.setVersion(version);
    return md;
}