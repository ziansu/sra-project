@org.junit.After
public void tearDown() {
    while ((eu.sqooss.test.service.scheduler.SchedulerTests.sched.getSchedulerStats().getWaitingJobs()) > 0)
        try {
            java.lang.System.out.println(eu.sqooss.test.service.scheduler.SchedulerTests.sched.getSchedulerStats().getWaitingJobs());
            java.lang.System.out.println("AfterClassSleeping");
            java.lang.Thread.sleep(500);
        } catch (java.lang.InterruptedException e) {
        }
    
    eu.sqooss.test.service.scheduler.SchedulerTests.sched.stopExecute();
}