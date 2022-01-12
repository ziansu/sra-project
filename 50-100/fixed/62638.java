public static android.database.Cursor fetchAllSets(android.database.sqlite.SQLiteDatabase sqLiteDatabase) throws com.gelakinetic.mtgfam.helpers.database.FamiliarDbException {
    android.database.Cursor c;
    try {
        java.lang.String[] allSetDataKeys = new java.lang.String[com.gelakinetic.mtgfam.helpers.database.CardDbAdapter.ALL_SET_DATA_KEYS.size()];
        com.gelakinetic.mtgfam.helpers.database.CardDbAdapter.ALL_SET_DATA_KEYS.toArray(allSetDataKeys);
        c = sqLiteDatabase.query(com.gelakinetic.mtgfam.helpers.database.CardDbAdapter.DATABASE_TABLE_SETS, allSetDataKeys, null, null, null, null, ((com.gelakinetic.mtgfam.helpers.database.CardDbAdapter.KEY_DATE) + " DESC"));
    } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException | java.lang.NullPointerException e) {
        throw new com.gelakinetic.mtgfam.helpers.database.FamiliarDbException(e);
    }
    return c;
}