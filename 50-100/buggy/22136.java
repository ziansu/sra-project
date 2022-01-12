private boolean upgradeEighteenNineteen(net.sqlcipher.database.SQLiteDatabase db) {
    db.beginTransaction();
    try {
        org.commcare.models.database.SqlStorage<org.commcare.android.database.user.models.ACase> caseStorage = new org.commcare.models.database.SqlStorage(org.commcare.android.database.user.models.ACase.STORAGE_KEY, org.commcare.android.database.user.models.ACase.class, new org.commcare.models.database.ConcreteAndroidDbHelper(c, db));
        org.commcare.models.database.user.models.AndroidCaseIndexTable indexTable = new org.commcare.models.database.user.models.AndroidCaseIndexTable(db);
        indexTable.reIndexAllCases(caseStorage);
        db.setTransactionSuccessful();
        db.endTransaction();
        return true;
    } finally {
        db.endTransaction();
    }
}