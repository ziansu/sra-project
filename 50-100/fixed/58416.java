private static boolean sendGraphiteMessage(com.pearson.statsagg.utilities.TcpClient tcpClient, int numSendRetries, java.lang.String graphiteMessage) {
    boolean isSendSuccess = true;
    if (tcpClient.isConnected()) {
        boolean isSendSucess = tcpClient.send(graphiteMessage, numSendRetries, false, true);
        if (!isSendSucess) {
            com.pearson.statsagg.metric_aggregation.threads.SendMetricsToGraphiteThread.logger.error("Error sending message to graphite.");
            isSendSuccess = false;
        }
    }else {
        com.pearson.statsagg.metric_aggregation.threads.SendMetricsToGraphiteThread.logger.error("Error creating TCP connection to graphite.");
        isSendSuccess = false;
    }
    return isSendSuccess;
}