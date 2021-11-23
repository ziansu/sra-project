public void reschedule(long time) {
    if ((timeOfNextRun) > time) {
        timeOfNextRun = time;
        org.flexiblepower.scheduling.Job.logger.trace("Rescheduled {}", this);
    }
}