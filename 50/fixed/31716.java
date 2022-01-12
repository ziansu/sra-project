public void loggerInitComplete(int rc, com.yahoo.omid.tso.persistence.StateLogger sl, java.lang.Object ctx) {
    if (rc == (com.yahoo.omid.tso.persistence.LoggerException.Code.OK)) {
        ((com.yahoo.omid.tso.persistence.BookKeeperStateBuilder.Context) (ctx)).setLogger(sl);
    }
}