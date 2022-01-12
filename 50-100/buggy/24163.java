public void deleteBlockSession(nyc.c4q.rosmaryfc.focus_app.BlockSession blockSession) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.delete(BlockSessionContract.TABLE_BLOCK_SESSIONS, ((BlockSessionContract.Columns.BLOCK_ID) + " = ?"), new java.lang.String[]{ java.lang.String.valueOf(nyc.c4q.rosmaryfc.focus_app.BlockSession.getId()) });
    db.close();
}