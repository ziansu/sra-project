@org.junit.Test
public void shouldScheduleTaskAppropriately() {
    org.mockito.Mockito.verify(timer).schedule(task, 0, uk.dangrew.jupa.update.download.NotificationSchedulerTest.PERIOD);
}