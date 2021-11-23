public void addMedia(java.lang.String mediaName) {
    if ((getIdForMedia(mediaName)) != (-1)) {
        android.util.Log.e("addMedia", "media already exists!");
        return ;
    }
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.example.MediaCounterApp.Model.MediaCounterDB.KEY_TITLE, mediaName);
    values.put(com.example.MediaCounterApp.Model.MediaCounterDB.KEY_COMPLETE, java.lang.Boolean.FALSE);
    db.insert(com.example.MediaCounterApp.Model.MediaCounterDB.TABLE_TITLES, null, values);
}