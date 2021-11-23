@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase sqLitDb, com.j256.ormlite.support.ConnectionSource connectionSource) {
    try {
        com.j256.ormlite.table.TableUtils.createTableIfNotExists(connectionSource, com.gw.ecapp.storage.model.ApplianceModel.class);
        com.j256.ormlite.table.TableUtils.createTableIfNotExists(connectionSource, com.gw.ecapp.storage.model.DeviceModel.class);
        android.util.Log.i(TAG, "Tables are created");
    } catch (java.sql.SQLException e) {
        android.util.Log.i(TAG, "error creation on table ");
        e.printStackTrace();
    }
}