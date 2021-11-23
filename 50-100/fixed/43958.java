@org.testng.annotations.Test
public void testScheduleJobWithRepeatTime() throws java.lang.Exception {
    org.quartz.JobDetail job1 = buildJob("Job1", org.quartz.Scheduler.DEFAULT_GROUP, com.bikeemotion.quartz.MyJob.class);
    final org.quartz.impl.triggers.SimpleTriggerImpl o = ((org.quartz.impl.triggers.SimpleTriggerImpl) (buildTrigger("key1", org.quartz.Scheduler.DEFAULT_GROUP, job1)));
    o.setRepeatInterval(100);
    o.setRepeatCount(10);
    scheduler.scheduleJob(job1, o);
    java.lang.Thread.sleep(750);
    org.testng.Assert.assertEquals(MyJob.count, 8);
    org.testng.Assert.assertEquals(MyJob.triggerKeys.poll(), "key1");
}