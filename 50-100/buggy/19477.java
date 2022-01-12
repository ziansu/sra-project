protected void stopHeartBeat() {
    java.util.TimerTask heartBeatTimerTask = this.heartBeatTimerTask;
    super.stopHeartBeat();
    if (heartBeatTimerTask != null) {
        com.alibaba.otter.canal.parse.inbound.mysql.MysqlConnection mysqlConnection = ((com.alibaba.otter.canal.parse.inbound.mysql.MysqlEventParser.MysqlDetectingTimeTask) (heartBeatTimerTask)).getMysqlConnection();
        try {
            mysqlConnection.disconnect();
        } catch (java.io.IOException e) {
            logger.error("ERROR # disconnect heartbeat connection for address:{}", mysqlConnection.getConnector().getAddress(), e);
        }
    }
}