public static com.aware.plugin.contextbroadcaster.ContextObserverWithMemory createInstanceLocatedAtEnd(android.os.Handler handler, android.net.Uri contentUri, android.content.ContentResolver contentResolver) {
    android.database.Cursor cursor = contentResolver.query(contentUri, null, null, null, null);
    int initialPosition = (cursor.getCount()) - 1;
    cursor.close();
    return new com.aware.plugin.contextbroadcaster.ContextObserverWithMemory(handler, contentUri, contentResolver, initialPosition);
}