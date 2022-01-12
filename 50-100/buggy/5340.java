private <IdType> IdType persistObjectApiDeprecate(java.lang.Class<?> modelClass, org.json.JSONObject jsonObject) throws org.json.JSONException {
    try {
        mDatabase.beginTransaction();
        IdType id = persistObjectInternal(modelClass, jsonObject);
        mDatabase.setTransactionSuccessful();
        return id;
    } finally {
        if (mDatabase.inTransaction()) {
            mDatabase.endTransaction();
        }
    }
}