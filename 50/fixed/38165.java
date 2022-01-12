public void exect() throws java.sql.SQLException {
    client.exect(this);
    ch.cern.impala.ogg.datapump.impala.Query.LOG.debug(("executed query: " + (this)));
}