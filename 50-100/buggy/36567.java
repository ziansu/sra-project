protected void openDatabase(final com.orientechnologies.orient.core.db.OPartitionedDatabasePool.DatabaseDocumentTxPolled db) {
    if ((!(db.getURL().startsWith("remote:"))) && (!(db.exists()))) {
        if (autoCreate)
            db.create();
        
    }else
        db.internalOpen();
    
}