public void exect() throws java.sql.SQLException {
    ch.cern.impala.ogg.datapump.impala.Query.LOG.debug(("executed query: " + (this)));
    client.exect(this);
}