public org.redisson.RedisRunner replBacklogSize(java.lang.String replBacklogSize) {
    addConfigOption(org.redisson.RedisRunner.REDIS_OPTIONS.REPL_BACKLOG_SIZE, replBacklogSize);
    return this;
}