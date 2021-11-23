public void deleteAllHistory() {
    java.lang.String libraryId = net.muxi.huashiapp.util.PreferenceUtil.getString(PreferenceUtil.LIBRARY_ID);
    db.execSQL((((("DELETE FROM " + (DataBase.TABLE_SEARCH_HISTORY)) + " WHERE ") + (DataBase.KEY_LIBRARY_USER_ID)) + " = ? "), new java.lang.String[]{ libraryId });
}