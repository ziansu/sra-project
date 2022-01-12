@org.jboss.seam.annotations.security.Restrict(value = "#{s:hasPermission('trust', 'access')}")
public java.lang.String uploadFile() {
    log.info("uploadFile() call for IDP");
    return org.gluu.oxtrust.util.OxTrustConstants.RESULT_SUCCESS;
}