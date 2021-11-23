public android.content.ContentValues getContentValues() {
    android.content.ContentValues cv = new android.content.ContentValues();
    cv.put(de.vegie1996.fhem_monkey.database.tables.LevelsTable.COLUMNNAME_LEVELS_ID, id);
    cv.put(de.vegie1996.fhem_monkey.database.tables.LevelsTable.COLUMNNAME_LEVELS_NAME, name);
    cv.put(de.vegie1996.fhem_monkey.database.tables.LevelsTable.COLUMNNAME_LEVELS_ICON, icon);
    cv.put(de.vegie1996.fhem_monkey.database.tables.LevelsTable.COLUMNNAME_LEVELS_PARENT_ID, parentId);
    return cv;
}