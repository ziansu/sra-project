public java.util.List<com.hlb.dblogging.jpa.model.AuditMaster> getAuditMasterMessageList() {
    if (((auditMasterList) == null) || ((insertDeleted) == true)) {
        auditMasterList = auditMasterService.getListOfMessagesByTime(new java.util.Date());
        com.hlb.dblogging.log.utility.ApplLogger.getLogger().info(("AuditMaster list of size from database is : " + (auditMasterList.size())));
    }
    return auditMasterList;
}