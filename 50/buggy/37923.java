public static com.ponysdk.core.server.concurrent.PScheduler.UIRunnable scheduleWithFixedDelay(final java.lang.Runnable runnable, final java.time.Duration delay, final java.time.Duration period) {
    return com.ponysdk.core.server.concurrent.PScheduler.INSTANCE.scheduleWithFixedDelay0(runnable, delay.toMillis(), delay.toMillis());
}