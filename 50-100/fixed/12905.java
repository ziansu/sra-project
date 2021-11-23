@java.lang.Override
protected me.aerovulpe.crawler.data.Photo[] doInBackground(android.database.Cursor... params) {
    if (params[0].isClosed())
        return null;
    
    me.aerovulpe.crawler.data.Photo[] photos = null;
    try {
        photos = me.aerovulpe.crawler.data.Photo.arrayFromCursor(params[0]);
    } catch (android.database.StaleDataException e) {
        e.printStackTrace();
    }
    return photos;
}