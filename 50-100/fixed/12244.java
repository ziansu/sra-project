boolean insertUserChild(java.lang.String userId, long childId, int isOwner) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues childUserTableContent = new android.content.ContentValues();
    childUserTableContent.put(baps.DatabaseHelper.UC_USER_ID, userId);
    childUserTableContent.put(baps.DatabaseHelper.UC_CHILD_ID, childId);
    childUserTableContent.put(baps.DatabaseHelper.UC_ISOWNER, isOwner);
    long result2 = db.insert(baps.DatabaseHelper.BAPS_USERCHILD_TABLE, null, childUserTableContent);
    return result2 != (-1);
}