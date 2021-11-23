public void updateAppInfo(com.dkanada.openapk.AppInfo appInfo) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    removeAppInfo(appInfo);
    addAppInfo(appInfo);
}