protected void openDatabase(final com.orientechnologies.orient.core.db.OPartitionedDatabasePool.DatabaseDocumentTxPolled db) {
    if (autoCreate) {
        if ((!(db.getURL().startsWith("remote:"))) && (!(db.exists()))) {
            db.create();
        }else {
            db.internalOpen();
        }
    }else {
        db.internalOpen();
    }
}