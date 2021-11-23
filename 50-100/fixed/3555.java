public internetofeveryone.ioe.Data.Contact getContactByID(java.lang.String userCode) {
    android.database.Cursor cursor = sql.query(TableData.Contacts.TABLE_CONTACTS, contactColumns, ((TableData.Contacts.COLUMN_CONTACTS_USERCODE) + " = ?"), new java.lang.String[]{ userCode }, null, null, null);
    if (cursor != null) {
        if (!(cursor.moveToFirst())) {
            return null;
        }
    }
    internetofeveryone.ioe.Data.Contact contact = cursorToContact(cursor);
    if (cursor != null) {
        cursor.close();
    }
    return contact;
}