public int updateLastUseOfPgpContact(android.content.Context context, com.flowcrypt.email.test.PgpContact pgpContact) {
    android.content.ContentResolver contentResolver = context.getContentResolver();
    if ((pgpContact != null) && (contentResolver != null)) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.flowcrypt.email.database.dao.source.ContactsDaoSource.COL_LAST_USE, java.lang.System.currentTimeMillis());
        return contentResolver.update(getBaseContentUri(), contentValues, ((com.flowcrypt.email.database.dao.source.ContactsDaoSource.COL_EMAIL) + " = ?"), new java.lang.String[]{ pgpContact.getEmail() });
    }else
        return -1;
    
}