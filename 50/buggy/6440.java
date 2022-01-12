private static xdb.Session init() {
    xdb.TimeSeriesDB2.checkDir(xdb.TimeSeriesDB2.db);
    xdb.TimeSeriesDB2.conn = wiredtiger.open(xdb.TimeSeriesDB2.db, "create");
    xdb.Session session = xdb.TimeSeriesDB2.conn.open_session(null);
    session.create(xdb.TimeSeriesDB2.table, xdb.TimeSeriesDB2.storage);
    return session;
}