@org.junit.Test
public void getCurrentPoolSizeTest() {
    org.threadly.concurrent.PrioritySchedulerTest.PrioritySchedulerFactory factory = getPrioritySchedulerFactory();
    org.threadly.concurrent.PriorityScheduler scheduler = factory.makePriorityScheduler(1);
    try {
        assertEquals(1, scheduler.getCurrentPoolSize());
        org.threadly.test.concurrent.TestRunnable tr = new org.threadly.test.concurrent.TestRunnable();
        scheduler.execute(tr);
        tr.blockTillStarted();
        assertEquals(1, scheduler.getCurrentPoolSize());
    } finally {
        factory.shutdown();
    }
}