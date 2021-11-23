public static void cancelAllDownloads(android.content.Context context) {
    android.app.DownloadManager manager = ((android.app.DownloadManager) (context.getSystemService(Context.DOWNLOAD_SERVICE)));
    android.app.DownloadManager.Query query = new android.app.DownloadManager.Query();
    query.setFilterByStatus(((((android.app.DownloadManager.STATUS_FAILED) | (android.app.DownloadManager.STATUS_PENDING)) | (android.app.DownloadManager.STATUS_PAUSED)) | (android.app.DownloadManager.STATUS_RUNNING)));
    android.database.Cursor cur = manager.query(query);
    while (cur.moveToNext()) {
        manager.remove(cur.getLong(cur.getColumnIndex(DownloadManager.COLUMN_ID)));
    } 
}