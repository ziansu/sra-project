public com.swrve.ratelimitedlogger.RateLimitedLog build() {
    com.google.common.base.Preconditions.checkArgument(((maxRate) > 0), "maxRate must be > 0");
    com.google.common.base.Preconditions.checkArgument(((periodLength.getMillis()) > 0L), "period must be non-zero");
    stopwatch.start();
    return new com.swrve.ratelimitedlogger.RateLimitedLog(logger, new com.swrve.ratelimitedlogger.RateLimitedLogWithPattern.RateAndPeriod(maxRate, periodLength), stopwatch, stats, RateLimitedLog.REGISTRY);
}