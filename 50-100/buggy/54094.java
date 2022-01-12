@android.support.annotation.Nullable
private java.util.Set<java.lang.Long> searchTableForIdsByName(java.lang.String SQL, java.lang.String idColumnString) {
    android.database.Cursor c = readableDatabase.rawQuery(SQL, null);
    if (c != null) {
        java.util.Set<java.lang.Long> ids = new java.util.HashSet(c.getCount());
        while (c.moveToNext()) {
            int idInd = c.getColumnIndex(idColumnString);
            ids.add(c.getLong(idInd));
        } 
        c.close();
        return ids;
    }
    return null;
}