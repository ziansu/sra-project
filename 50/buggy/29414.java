public void open() throws android.database.SQLException {
    if (((database) == null) || (!(database.isOpen()))) {
        database = db_helper.getWritableDatabase();
    }
}