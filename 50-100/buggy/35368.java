@java.lang.Override
public void audit(io.apiman.manager.api.beans.audit.AuditEntryBean entry) {
    try {
        logger.info(((Messages.i18n.format("StorageImportDispatcher.ImportingAuditEntry")) + entry));
        entry.setId(null);
        storage.createAuditEntry(entry);
    } catch (io.apiman.manager.api.core.exceptions.StorageException e) {
        error(e);
    }
}