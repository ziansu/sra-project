@org.jboss.seam.annotations.security.Restrict(value = "#{s:hasPermission('person', 'access')}")
public java.lang.String search() {
    if (org.xdi.util.Util.equals(this.oldSearchPattern, this.searchPattern)) {
        return org.gluu.oxtrust.util.OxTrustConstants.RESULT_SUCCESS;
    }
    try {
        this.personList = personService.searchPersons(this.searchPattern);
        this.oldSearchPattern = this.searchPattern;
    } catch (java.lang.Exception ex) {
        log.error("Failed to find persons", ex);
        return org.gluu.oxtrust.util.OxTrustConstants.RESULT_FAILURE;
    }
    return org.gluu.oxtrust.util.OxTrustConstants.RESULT_SUCCESS;
}