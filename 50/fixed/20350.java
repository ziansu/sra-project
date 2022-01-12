public void stop() throws java.lang.Exception {
    lmdb.server.XQueryServer.server.stop();
    lmdb.db.JdbcDataManager.stop();
    lmdb.basex.LmdbDataManager.stop();
    lmdb.server.XQueryServer.logger.info("stop");
}