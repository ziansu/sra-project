public int getID(java.lang.String userEmail) {
    int id_key = -99;
    android.database.Cursor cursor = db.query("users", null, "email =?", new java.lang.String[]{ userEmail }, null, null, null, null);
    if (cursor != null) {
        cursor.moveToFirst();
        id_key = cursor.getInt(0);
    }
    return id_key;
}