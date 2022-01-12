@java.lang.Override
public void jobStateUpdatedEvent(org.ow2.proactive.scheduler.common.NotificationData<org.ow2.proactive.scheduler.common.job.JobInfo> notification) {
    org.ow2.proactive.scheduler.common.job.JobStatus status = notification.getData().getStatus();
    java.lang.System.out.println(((("RestSmartProxyTest.jobStateUpdatedEvent, eventType=" + (notification.getEventType())) + ", jobStatus=") + status));
    if (status == (org.ow2.proactive.scheduler.common.job.JobStatus.IN_ERROR)) {
        semaphore.release();
    }
}