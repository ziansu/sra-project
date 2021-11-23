@java.lang.Override
public org.springframework.boot.actuate.health.Health health() {
    org.springframework.boot.actuate.health.Health.Builder builder = new org.springframework.boot.actuate.health.Health.Builder();
    if ((timeEntryRepo.list().size()) > (io.pivotal.pal.tracker.TimeEntryHealthIndicator.MAX_TIME_ENTRIES)) {
        builder.up();
    }else {
        builder.down();
    }
    return builder.build();
}