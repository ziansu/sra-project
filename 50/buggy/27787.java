private void moveCursorToRandomPosition(android.database.Cursor cursor) {
    int rowCount = cursor.getCount();
    int randomRowPosition = ((int) ((java.lang.Math.random()) * (rowCount + 1)));
    cursor.moveToPosition(randomRowPosition);
}