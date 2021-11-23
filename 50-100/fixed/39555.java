private void checkDatabaseExists(java.lang.String dbname, io.sqlc.CallbackContext cbc) {
    java.io.File dbfile = this.cordova.getActivity().getDatabasePath(dbname);
    try {
        cbc.success((dbfile.exists() ? 1 : 0));
    } catch (java.lang.Exception e) {
        android.util.Log.e(io.sqlc.SQLitePlugin.class.getSimpleName(), "couldn't check if database exists", e);
        cbc.error("couldn't check if database exists");
    }
}