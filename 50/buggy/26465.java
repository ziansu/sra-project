private void openConnection() {
    hevs.ch.database.DatabaseAccess.helper = new hevs.ch.database.SQLHelper(context, null);
    hevs.ch.database.DatabaseAccess.database = hevs.ch.database.DatabaseAccess.helper.getWritableDatabase();
}