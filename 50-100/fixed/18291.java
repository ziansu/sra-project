public static org.sqlite.SQLiteDataSource newDataSource(final java.io.File db, final boolean readOnly) {
    org.sqlite.SQLiteDataSource dataSource = new org.sqlite.SQLiteDataSource();
    dataSource.setReadOnly(readOnly);
    dataSource.setUrl(("jdbc:sqlite:" + (db.getAbsolutePath())));
    dataSource.setSynchronous(org.locationtech.geogig.storage.sqlite.Xerial.DEFAULT_SYNC_MODE.getValue());
    final int MAX_PAGE_SIZE = 65536;
    dataSource.setPageSize(MAX_PAGE_SIZE);
    dataSource.setSharedCache(true);
    dataSource.setReadUncommited(true);
    dataSource.setLockingMode(LockingMode.NORMAL.getValue());
    return dataSource;
}