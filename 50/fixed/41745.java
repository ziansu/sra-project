private void removeFromFavorites() {
    android.database.sqlite.SQLiteDatabase writeable = new dylan.com.adoptapet.FavoritesDBHelper(this).getWritableDatabase();
    writeable.delete(FavoritesDBHelper.table_name, "id = ?", new java.lang.String[]{ currentPet.getId() });
    writeable.close();
}