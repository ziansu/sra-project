public int findPositionById(long id) {
    android.database.Cursor cursor = getList();
    if (cursor == null)
        return -1;
    
    while (cursor.moveToNext()) {
        if ((cursor.getLong(0)) == id) {
            return cursor.getPosition();
        }
    } 
    return -1;
}