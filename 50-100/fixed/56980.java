public void validate() {
    validateSystemProperty(Constants.CEP_STATS_PUBLISHER_ENABLED);
    validateSystemProperty(Constants.CLUSTER_ID);
    validateSystemProperty(Constants.NAME_PREFIX);
    validateSystemProperty(Constants.PROJECT_NAME);
    validateSystemProperty(Constants.PROJECT_ID);
    validateSystemProperty(Constants.ZONE_NAME);
    validateSystemProperty(Constants.REGION_NAME);
    validateSystemProperty(Constants.KEY_FILE_PATH);
    validateSystemProperty(Constants.GCE_ACCOUNT_ID);
    if (cepStatsPublisherEnabled) {
        validateSystemProperty(Constants.THRIFT_RECEIVER_IP);
        validateSystemProperty(Constants.THRIFT_RECEIVER_PORT);
        validateSystemProperty(Constants.NETWORK_PARTITION_ID);
    }
}