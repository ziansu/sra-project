public <IdType> java.util.List<IdType> persistArrayDeprecate(java.lang.Class<?> modelClass, org.json.JSONArray jsonArray) throws org.json.JSONException {
    try {
        mDatabase.beginTransaction();
        java.util.List<IdType> id_list = persistArrayOfObjects(modelClass, jsonArray);
        mDatabase.setTransactionSuccessful();
        return id_list;
    } catch (org.json.JSONException e) {
        throw e;
    } finally {
        if (mDatabase.inTransaction()) {
            mDatabase.endTransaction();
        }
    }
}