public int updateNameOfPgpContact(android.content.Context context, java.lang.String email, java.lang.String name) {
    android.content.ContentResolver contentResolver = context.getContentResolver();
    if (contentResolver != null) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.flowcrypt.email.database.dao.source.ContactsDaoSource.COL_NAME, name);
        return contentResolver.update(getBaseContentUri(), contentValues, ((com.flowcrypt.email.database.dao.source.ContactsDaoSource.COL_EMAIL) + " = ?"), new java.lang.String[]{ email.toLowerCase() });
    }else
        return -1;
    
}