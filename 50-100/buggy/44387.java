protected boolean checkDatiCursor(android.database.Cursor cursor) {
    boolean result = false;
    if (cursor != null) {
        if (cursor.isBeforeFirst()) {
            cursor.moveToFirst();
            if ((cursor.getCount()) > 0)
                result = true;
            
        }
    }
    return result;
}