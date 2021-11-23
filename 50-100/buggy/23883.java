public com.flowcrypt.email.test.PgpContact getPgpContact(android.content.Context context, java.lang.String email) {
    android.content.ContentResolver contentResolver = context.getContentResolver();
    android.database.Cursor cursor = contentResolver.query(getBaseContentUri(), null, ((com.flowcrypt.email.database.dao.source.ContactsDaoSource.COL_EMAIL) + " = ?"), new java.lang.String[]{ email }, null);
    com.flowcrypt.email.test.PgpContact pgpContact = null;
    if (cursor != null) {
        if (cursor.moveToFirst()) {
            pgpContact = getCurrentPgpContact(cursor);
        }
        cursor.close();
    }
    return pgpContact;
}