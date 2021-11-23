public long insertRow(java.lang.String name, java.lang.String icon, java.lang.String sample, int used, int broken) {
    android.content.ContentValues initialValues = new android.content.ContentValues();
    initialValues.put(rory.bain.counter.app.libraryDBAdapter.KEY_NAME, name);
    initialValues.put(rory.bain.counter.app.libraryDBAdapter.KEY_ICON, icon);
    initialValues.put(rory.bain.counter.app.libraryDBAdapter.KEY_SAMPLE, sample);
    initialValues.put(rory.bain.counter.app.libraryDBAdapter.KEY_USED, used);
    initialValues.put(rory.bain.counter.app.libraryDBAdapter.KEY_BROKEN, broken);
    (rory.bain.counter.app.libraryDBAdapter.size)++;
    return db.insert(rory.bain.counter.app.libraryDBAdapter.DATABASE_TABLE, null, initialValues);
}