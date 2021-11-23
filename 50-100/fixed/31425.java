@java.lang.Override
public java.lang.Object start() throws org.exist.storage.ReadOnlyException {
    try {
        domDb.addValue(transaction, new org.exist.storage.NativeBroker.NodeRef(doc.getDocId(), node.getNodeId()), address);
    } catch (org.exist.storage.BTreeException | java.io.IOException e) {
        org.exist.storage.LOG.error(org.exist.storage.NativeBroker.EXCEPTION_DURING_REINDEX, e);
    }
    return null;
}