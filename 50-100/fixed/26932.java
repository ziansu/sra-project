public int deletePgpContact(android.content.Context context, java.lang.String email) {
    android.content.ContentResolver contentResolver = context.getContentResolver();
    if (contentResolver != null) {
        return contentResolver.delete(getBaseContentUri(), ((com.flowcrypt.email.database.dao.source.ContactsDaoSource.COL_EMAIL) + " = ?"), new java.lang.String[]{ email.toLowerCase() });
    }else
        return -1;
    
}