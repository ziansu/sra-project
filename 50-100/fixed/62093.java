@org.testng.annotations.Test(enabled = false)
@com.google.common.eventbus.Subscribe
public void handleNewJobConfigArrival(gobblin.cluster.event.NewJobConfigArrivalEvent newJobConfigArrivalEvent) {
    java.util.Properties jobConfig = newJobConfigArrivalEvent.getJobConfig();
    this.receivedJobConfigs.add(jobConfig);
    if (jobConfig.getProperty(gobblin.aws.AWSJobConfigurationManagerTest.JOB_NAME_KEY).equalsIgnoreCase(gobblin.aws.AWSJobConfigurationManagerTest.JOB_FIRST_NAME)) {
        this.countDownLatchBootUp.countDown();
    }else {
        this.countDownLatchUpdate.countDown();
    }
}