@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
private <IdType> IdType persistObjectApi11(java.lang.Class<?> modelClass, org.json.JSONObject jsonObject) throws org.json.JSONException {
    try {
        enableWriteAheadLogging();
        mDatabase.beginTransactionNonExclusive();
        IdType id = persistObjectInternal(modelClass, jsonObject);
        mDatabase.setTransactionSuccessful();
        return id;
    } finally {
        endTransaction();
    }
}