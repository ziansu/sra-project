protected java.util.ArrayList<java.lang.String> getPublishers() {
    java.util.ArrayList<java.lang.String> publisher_list = new java.util.ArrayList<java.lang.String>();
    android.database.Cursor publisher_cur = mDbHelper.fetchAllPublishers();
    try {
        while (publisher_cur.moveToNext()) {
            java.lang.String publisher = publisher_cur.getString(publisher_cur.getColumnIndexOrThrow(CatalogueDBAdapter.KEY_PUBLISHER));
            publisher_list.add(publisher);
        } 
        return publisher_list;
    } finally {
        publisher_cur.close();
    }
}