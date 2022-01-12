@java.lang.Override
protected java.lang.Long doInBackground(java.lang.String... strings) {
    mFileStorage = new com.fedorvlasov.lazylist.FileCache();
    long store_total = 0;
    java.io.File[] listStore = new java.io.File(strings[0]).listFiles();
    for (final java.io.File oneFold : listStore) {
        if ((oneFold.getName().equals("cache")) || (oneFold.getName().equals("dbs")))
            continue;
        
        store_total += mFileStorage.dirSize(oneFold);
    }
    return store_total;
}