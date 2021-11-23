public io.codearcs.candlestack.nagios.object.services.Service getService(java.lang.String commanNameSuffix, java.lang.String notificationPeriod, java.lang.String instanceId, java.util.Set<java.lang.String> contactGroups) throws io.codearcs.candlestack.CandlestackPropertiesException {
    long warning = io.codearcs.candlestack.aws.GlobalAWSProperties.getEC2MetricbeatMetricWarningLevel(instanceId, this);
    long critical = io.codearcs.candlestack.aws.GlobalAWSProperties.getEC2MetricbeatMetricCriticalLevel(instanceId, this);
    java.lang.String command = (((((((commandName) + commanNameSuffix) + "!") + instanceId) + "!") + warning) + "!") + critical;
    return new io.codearcs.candlestack.nagios.object.services.Service(serviceName, instanceId, command, notes, notificationPeriod, contactGroups);
}