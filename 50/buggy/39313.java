private com.trinet.audit.response.AuditResponse verifyAudit(com.trinet.audit.entity.Audit audit) {
    com.trinet.audit.response.AuditResponse auditResponse = null;
    if (com.trinet.audit.util.AuditUtils.verifyAudit(audit)) {
        auditResponse = setResponseObject(audit, ServiceConstants.AUDIT_FIELDVALIDATION_MSG, ServiceConstants.MESSAGE_RESPONSE_FORBIDDEN_CODE);
        com.trinet.audit.service.AuditServiceImpl.LOGGER.info("Insufficient input data for auditing....");
    }
    return auditResponse;
}