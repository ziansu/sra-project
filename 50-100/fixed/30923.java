@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase database, com.j256.ormlite.support.ConnectionSource source, int oldVersion, int newVersion) {
    android.util.Log.w(be.rottenrei.android.lib.model.DatabaseOpenHelperBase.class.getName(), ((("Upgrading database from version " + oldVersion) + " to ") + newVersion));
    try {
        getMigrationManager().upgradeFrom(database, source, oldVersion);
    } catch (java.sql.SQLException e) {
        be.rottenrei.android.lib.util.ExceptionUtils.handleFatalExceptionWithMessage(e, getContext(), R.string.error_db_migrate, be.rottenrei.android.lib.model.DatabaseOpenHelperBase.class);
    }
}