public com.comcast.cats.service.ir.redrat.RedRatHubConnection getConnection(com.comcast.cats.service.ir.redrat.IrNetBoxPro irNetBoxPro, int portNumber) {
    com.comcast.cats.service.ir.redrat.RedRatHub.logger.trace(((("getConnection irNetBoxPro " + irNetBoxPro) + " port ") + portNumber));
    com.comcast.cats.service.ir.redrat.RedRatHubConnection portConnection = null;
    if ((irNetBoxPro != null) && (portNumber >= 0)) {
        portConnection = hubConnectionPool.getConnection();
        com.comcast.cats.service.ir.redrat.RedRatHub.logger.debug(("Redrathub  " + portConnection));
        if (portConnection != null) {
            com.comcast.cats.service.ir.redrat.RedRatHub.activeConnections.add(portConnection);
        }
    }
    return portConnection;
}