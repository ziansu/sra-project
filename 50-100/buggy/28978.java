public com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult describeAlarms(com.amazonaws.services.elasticbeanstalk.model.EnvironmentDescription ed) {
    java.lang.String topicArn = resources.getRdsAlertTopicArn();
    com.amazonaws.services.elasticbeanstalk.model.LoadBalancer loadBalancer = getLoadBalancerFromEnvironmentName(ed.getEnvironmentName());
    com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest req = org.sagebionetworks.stack.alarms.ElbAlarmSetup.createDescribeAlarmsRequest(ed.getEnvironmentName(), loadBalancer, topicArn);
    com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult res = this.cloudWatchClient.describeAlarms(req);
    return res;
}