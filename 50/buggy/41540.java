@org.springframework.context.annotation.Bean
public org.atlasapi.remotesite.bbc.nitro.ChannelDayProcessingTask picksScheduledTask() {
    return new org.atlasapi.remotesite.bbc.nitro.ChannelDayProcessingTask(java.util.concurrent.Executors.newSingleThreadExecutor(), picksDayRangeChannelDaySupplier(), picksDayUpdater(), picksScheduledTaskListener(), metricRegistry, "picks.");
}