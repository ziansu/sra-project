private synchronized net.kourlas.voipms_sms.model.Message getMessageWithDatabaseId(long databaseId) {
    android.database.Cursor cursor = database.query(net.kourlas.voipms_sms.db.Database.TABLE_MESSAGE, net.kourlas.voipms_sms.db.Database.columns, (((net.kourlas.voipms_sms.db.Database.COLUMN_DATABASE_ID) + "=") + databaseId), null, null, null, null);
    java.util.List<net.kourlas.voipms_sms.model.Message> messages = getMessageListFromCursor(cursor);
    cursor.close();
    if ((messages.size()) > 0) {
        return messages.get(0);
    }else {
        return null;
    }
}