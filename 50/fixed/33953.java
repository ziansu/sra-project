private static de.struckmeierfliesen.ds.micromanagement.Food cursorToFood(android.database.Cursor cursor) {
    return de.struckmeierfliesen.ds.micromanagement.sqlite.DatabaseConnection.cursorToFood(cursor, (-1), true);
}