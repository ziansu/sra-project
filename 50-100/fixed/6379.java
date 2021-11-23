@java.lang.Override
public boolean update(java.lang.String identifier, java.util.Map<java.lang.String, java.lang.String> metadata) {
    validateMetadata(metadata, false);
    java.lang.String rowid = getRowId(identifier);
    if (rowid == null) {
        org.lp20.aikuma.storage.FusionIndex.log.severe("update called on item without an existing index entry");
        return false;
    }
    doPost(identifier, makeUpdate(rowid, metadata));
    return true;
}