public org.redisson.RedisRunner save(long seconds, long changes) {
    addConfigOption(org.redisson.RedisRunner.REDIS_OPTIONS.SAVE, ("" + seconds), ("" + changes));
    return this;
}