@java.lang.Override
public void removeDataId(java.lang.Long dataId, java.lang.Long auditLogId) {
    if ((this.DATA_IDS) == null) {
        this.DATA_IDS = new java.util.ArrayList<>(1);
        this.DATA_IDS.add(dataId);
    }else
        if (this.DATA_IDS.contains(dataId)) {
            this.DATA_IDS.remove(dataId);
        }else {
        }
    
    addAuditLogId(auditLogId);
}