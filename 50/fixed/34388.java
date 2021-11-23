public void reschedule(long time) {
    timeOfNextRun = time;
    org.flexiblepower.scheduling.Job.logger.trace("Rescheduled {}", this);
}