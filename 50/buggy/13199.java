@javax.annotation.PostConstruct
@java.lang.Override
protected void init() {
    scheduler.addJob(new rs.pelotas.tracker.batch.PositionJob());
    scheduler.scheduleJobs();
}