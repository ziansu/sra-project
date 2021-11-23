public static void insertDefaults(android.database.sqlite.SQLiteDatabase db) {
    android.content.ContentValues values = new android.content.ContentValues();
    long updateTime = java.lang.System.currentTimeMillis();
    values.put(MixnMatchColumns.COL_VALUE, org.cyanogenmod.themes.provider.ThemesOpenHelper.SYSTEM_THEME_PKG_NAME);
    values.put(MixnMatchColumns.COL_UPDATE_TIME, updateTime);
    for (java.lang.String key : android.provider.ThemesContract.MixnMatchColumns.ROWS) {
        values.put(MixnMatchColumns.COL_KEY, key);
        db.insert(org.cyanogenmod.themes.provider.ThemesOpenHelper.MixnMatchTable.TABLE_NAME, null, values);
    }
}