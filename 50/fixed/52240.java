protected java.lang.Short getNetworkAccessPointTypeCode(java.lang.String hostAddress) {
    if (org.apache.commons.validator.routines.InetAddressValidator.getInstance().isValid(hostAddress)) {
        return gov.hhs.fha.nhinc.audit.AuditTransformsConstants.NETWORK_ACCESSOR_PT_TYPE_CODE_IP;
    }
    return gov.hhs.fha.nhinc.audit.AuditTransformsConstants.NETWORK_ACCESSOR_PT_TYPE_CODE_NAME;
}