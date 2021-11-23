public long createCommonName(java.lang.String commonName, java.lang.String commonNameCount) {
    android.util.Log.i(balu.android.database.CommonNamesAdapter.TAG, "Inserting record...");
    android.content.ContentValues initialValues = new android.content.ContentValues();
    initialValues.put(balu.android.database.CommonNamesAdapter.COMMON_NAME_COUNT, commonNameCount);
    initialValues.put(balu.android.database.CommonNamesAdapter.COMMON_NAME, commonName);
    return database.insert(balu.android.database.CommonNamesAdapter.DATABASE_TABLE_1, null, initialValues);
}