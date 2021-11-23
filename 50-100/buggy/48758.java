@java.lang.Override
public void run() {
    co.cask.cdap.master.startup.ConfigurationCheck.LOG.info("Checking that config settings are valid.");
    java.util.Set<java.lang.String> problemKeys = new java.util.HashSet<>();
    checkServiceResources(problemKeys);
    checkBindAddresses();
    checkPotentialPortConflicts();
    checkKafkaTopic(problemKeys);
    checkMessagingTopics(problemKeys);
    checkLogPartitionKey(problemKeys);
    if (!(problemKeys.isEmpty())) {
        throw new java.lang.RuntimeException(("Invalid configuration settings for keys: " + (com.google.common.base.Joiner.on(',').join(problemKeys))));
    }
    co.cask.cdap.master.startup.ConfigurationCheck.LOG.info("  Configuration successfully verified.");
}