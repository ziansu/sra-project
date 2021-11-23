@javax.ejb.TransactionAttribute(value = javax.ejb.TransactionAttributeType.REQUIRED)
public void addAccountLink(java.lang.String userId, gov.medicaid.entities.ExternalAccountLink link) throws gov.medicaid.services.PortalServiceException {
    gov.medicaid.entities.ExternalAccountLink existing = findAccountLink(userId, link.getSystemId(), link.getExternalUserId());
    if (existing == null) {
        link.setId(getSequence().getNextValue(Sequences.ACOUNT_LINK_SEQ));
        link.setUserId(userId);
        getEm().persist(link);
        auditNewAccountLink(userId, link);
    }
}