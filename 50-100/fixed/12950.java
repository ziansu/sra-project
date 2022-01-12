public static int findPositionById(android.database.Cursor list, long id) {
    if (list == null)
        return -1;
    
    while (list.moveToNext()) {
        if ((list.getLong(0)) == id) {
            return list.getPosition();
        }
    } 
    return -1;
}