public org.redisson.RedisRunner unixsocketperm(int unixsocketperm) {
    addConfigOption(org.redisson.RedisRunner.REDIS_OPTIONS.UNIXSOCKETPERM, ("" + unixsocketperm));
    return this;
}