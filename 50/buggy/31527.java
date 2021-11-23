public org.redisson.RedisRunner slaveof(java.net.Inet4Address masterip, int port) {
    addConfigOption(org.redisson.RedisRunner.REDIS_OPTIONS.SLAVEOF, masterip.getHostAddress(), ("" + port));
    return this;
}