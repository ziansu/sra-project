public void insertDBNow(java.util.ArrayList<com.vnguyen.liveokeremote.data.Song> songsList) throws java.lang.Exception {
    try {
        db = new com.vnguyen.liveokeremote.db.SongListDataSource(context);
        db.open();
        db.getDbHelper().resetDB(db.getDatabase());
        db.insertAll(songsList);
        db.close();
        db = null;
    } catch (java.lang.Exception e) {
        android.util.Log.e(LiveOkeRemoteApplication.TAG, e.getMessage(), e);
        throw new java.lang.Exception(e);
    }
}