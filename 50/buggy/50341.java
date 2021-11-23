private void createDataBase() {
    database = new com.genyware.services.database.UserProjectsOpenHelper(this);
    database.deleteTable(database.getWritableDatabase());
}