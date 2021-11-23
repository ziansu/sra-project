public void createAlarms(com.amazonaws.services.elasticbeanstalk.model.EnvironmentDescription ed) {
    java.lang.String topicArn = resources.getRdsAlertTopicArn();
    com.amazonaws.services.elasticbeanstalk.model.LoadBalancer loadBalancer = getLoadBalancerFromEnvironmentName(ed.getEnvironmentName());
    java.util.List<com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest> reqs = org.sagebionetworks.stack.alarms.ElbAlarmSetup.createAllPutMetricAlarmRequests(ed.getEnvironmentName(), loadBalancer.getName(), topicArn);
    for (com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest req : reqs) {
        this.cloudWatchClient.putMetricAlarm(req);
    }
}