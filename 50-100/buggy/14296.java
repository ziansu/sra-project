public void addMessage(java.lang.String senderID, java.lang.String receiverID, java.lang.String content, boolean isEncrypted) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(TableData.Messages.COLUMN_MESSAGES_SENDERID, senderID);
    values.put(TableData.Messages.COLUMN_MESSAGES_RECEIVERID, receiverID);
    values.put(TableData.Messages.COLUMN_MESSAGES_CONTENT, content);
    values.put(TableData.Messages.COLUMN_MESSAGES_ISENCRYPTED, java.lang.String.valueOf(isEncrypted));
    long id = sql.insert(TableData.Messages.TABLE_MESSAGES, null, values);
    notify(DataType.MESSAGE);
}