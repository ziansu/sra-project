@java.lang.Override
public long getDelay(java.util.concurrent.TimeUnit unit) {
    long millisLeft = java.time.temporal.ChronoUnit.MILLIS.between(nowProvider.get(), dateTime);
    return unit.convert(millisLeft, org.kirhgoff.dtp.impl.DelayedCallable.MILLIS);
}