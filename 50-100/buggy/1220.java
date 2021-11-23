private void initialDatabase() {
    try {
        responderDatabase = openOrCreateDatabase("responder.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);
        responderDatabase.execSQL(com.gr.responder.MainActivity.CREATE_SMS_TABLE);
        responderDatabase.execSQL(com.gr.responder.MainActivity.CREATE_CALL_HISTORY);
        android.content.ContentValues values = new android.content.ContentValues();
        values.put("message", "DummyValue");
        long dummyID = responderDatabase.insert("tbl_sms", null, values);
    } catch (android.database.SQLException e) {
        e.printStackTrace();
    }
}