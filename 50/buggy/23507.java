public void deleteEvent(com.nicdsmith.test.gamenight.Event event) {
    long id = event.getId();
    java.lang.System.out.println(("event deleted with id: " + id));
    com.nicdsmith.test.gamenight.EventDataSource.database.delete(SQLiteHelper.TABLE_NAME, (((SQLiteHelper.COLUMN_ID) + " = ") + id), null);
}