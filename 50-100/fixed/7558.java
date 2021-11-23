public void task(android.database.sqlite.SQLiteDatabase db) {
    if (edit == null) {
        dbh.routes.insert(r, db);
    }else {
        dbh.routes.update(r, (((transcend.rockeeper.data.RouteContract._ID) + "=") + (edit.get(RouteContract._ID))), null, db);
    }
}