private void moveCursorToRandomPosition(android.database.Cursor cursor) {
    int rowCount = cursor.getCount();
    int randomRowPosition = ((int) ((java.lang.Math.random()) * rowCount));
    cursor.moveToPosition(randomRowPosition);
}