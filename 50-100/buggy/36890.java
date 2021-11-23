protected java.util.ArrayList<java.lang.String> getGenres() {
    java.util.ArrayList<java.lang.String> genre_list = new java.util.ArrayList<java.lang.String>();
    android.database.Cursor genre_cur = mDbHelper.fetchAllGenres("");
    try {
        while (genre_cur.moveToNext()) {
            java.lang.String genre = genre_cur.getString(genre_cur.getColumnIndexOrThrow(CatalogueDBAdapter.KEY_ROWID));
            genre_list.add(genre);
        } 
        return genre_list;
    } finally {
        genre_cur.close();
    }
}