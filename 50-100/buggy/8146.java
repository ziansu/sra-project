@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    android.util.Log.i(at.pardus.android.webview.gm.store.ScriptStoreSQLite.TAG, ((((("Upgrading database " + (at.pardus.android.webview.gm.store.ScriptStoreSQLite.ScriptDbHelper.DB)) + " from version ") + oldVersion) + " to ") + newVersion));
    switch (newVersion) {
        case at.pardus.android.webview.gm.store.ScriptStoreSQLite.ScriptDbHelper.DB_SCHEMA_VERSION_2 :
            db.execSQL(at.pardus.android.webview.gm.store.ScriptStoreSQLite.ScriptDbHelper.TBL_REQUIRE_CREATE);
            db.execSQL(at.pardus.android.webview.gm.store.ScriptStoreSQLite.ScriptDbHelper.TBL_RESOURCE_CREATE);
            break;
        default :
            android.util.Log.e(at.pardus.android.webview.gm.store.ScriptStoreSQLite.TAG, (((("Unexpected database upgrade from version" + oldVersion) + " to ") + newVersion) + ". No known upgrade path"));
            break;
    }
}