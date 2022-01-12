private com.ringov.notekeeper.model.different_storage_models.DBInterface chooseDBAccordingToStorageType(com.ringov.notekeeper.StorageMap.STORAGE_TYPE type) {
    com.ringov.notekeeper.model.different_storage_models.DBInterface db = null;
    switch (type) {
        case SQLITE_DATABASE :
            dbInterface = new com.ringov.notekeeper.model.different_storage_models.SQLiteDB();
            break;
        case SDCARD_FILE :
            dbInterface = new com.ringov.notekeeper.model.different_storage_models.ExternalCardDB();
            break;
        case SHARED_PREFERENCES :
        default :
            dbInterface = new com.ringov.notekeeper.model.different_storage_models.SQLiteDB();
            break;
    }
    if (db == null) {
        db = new com.ringov.notekeeper.model.different_storage_models.SQLiteDB();
    }
    return db;
}