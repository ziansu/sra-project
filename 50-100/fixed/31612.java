public void deleteLink(android.database.sqlite.SQLiteDatabase db, java.lang.String linkPath) {
    java.lang.String hash = readLink(db, linkPath);
    java.lang.String[] args = new java.lang.String[]{ linkPath };
    db.delete(com.door43.translationstudio.core.IndexerSQLiteHelper.TABLE_LINKS, "name=?", args);
    if ((hash != null) && ((countCatalogLinks(db, hash)) < 1)) {
        deleteCatalog(db, hash);
    }
}