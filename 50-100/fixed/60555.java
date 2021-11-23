@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    android.util.Log.d(TAG, "onUpgrade - start");
    createDB(db);
    java.util.List<com.modelingbrain.home.model.Model> models = com.modelingbrain.home.db.DBUpdaterManager.update(context, db, oldVersion, newVersion);
    addModelNormal(db, models);
    android.util.Log.d(TAG, "onUpgrade - finish");
}