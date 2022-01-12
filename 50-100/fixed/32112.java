public boolean isSaved(edu.auburn.eng.csse.comp3710.team8.Palette p) {
    java.lang.String temp = colorsToString(p);
    android.database.Cursor cursor = database.rawQuery((((((((("SELECT " + (DBManager.COLUMN_COLORS)) + " FROM ") + (DBManager.TABLE_PALETTES)) + " WHERE ") + (DBManager.COLUMN_COLORS)) + " = '") + temp) + "'"), null);
    if ((cursor.getCount()) > 0)
        return true;
    
    return false;
}