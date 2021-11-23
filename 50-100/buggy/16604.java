private boolean connect() {
    try {
        this.conn = com.ceridwen.selfissue.client.core.ConnectionFactory.getConnection(true);
        return this.doLogin();
    } catch (java.lang.Exception ex) {
        com.ceridwen.selfissue.client.core.ConnectionFactory.releaseConnection(conn);
        com.ceridwen.selfissue.client.core.CirculationHandlerImpl.logger.warn("Exception on connection", ex);
        return false;
    }
}