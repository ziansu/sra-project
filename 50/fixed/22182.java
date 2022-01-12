private void checkLogPartitionKey(java.util.Set<java.lang.String> problemKeys) {
    if (!(isValidPartitionKey(cConf.get(Constants.Logging.LOG_PUBLISH_PARTITION_KEY)))) {
        problemKeys.add(Constants.Logging.LOG_PUBLISH_PARTITION_KEY);
    }
}