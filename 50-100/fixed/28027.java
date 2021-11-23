public boolean updateTODO(java.lang.String id, java.lang.String addr, java.lang.String msg, boolean bStatus) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues cv = new android.content.ContentValues();
    cv.put("addr", addr);
    cv.put("msg", msg);
    java.lang.String strStatus = "false";
    if (bStatus) {
        strStatus = "true";
    }
    cv.put("status", strStatus);
    db.update("TODO", cv, "id=?", new java.lang.String[]{ id });
    return true;
}