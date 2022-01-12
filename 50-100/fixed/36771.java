private java.util.List<java.lang.String> getIdList(final java.util.List<? extends org.craftercms.commons.audit.AuditModel> toDelete) {
    java.util.List<java.lang.String> ids = new java.util.ArrayList<>(toDelete.size());
    for (org.craftercms.commons.audit.AuditModel auditModel : toDelete) {
        ids.add(auditModel.getId());
    }
    return ids;
}