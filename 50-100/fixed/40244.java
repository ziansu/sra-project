private com.owncloud.android.datamodel.OCFile getUploadFile(long id) {
    com.owncloud.android.datamodel.OCFile file = null;
    android.database.Cursor c = getDB().query(ProviderTableMeta.CONTENT_URI_FILE, null, ((com.owncloud.android.db.ProviderMeta.ProviderTableMeta._ID) + "=?"), new java.lang.String[]{ java.lang.String.valueOf(id) }, null);
    if (c.moveToFirst()) {
        file = createFileInstance(c);
        c.close();
    }
    return file;
}