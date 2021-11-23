public <T> void publish(java.lang.String topic, byte[] data) {
    redis.clients.jedis.Jedis jedis = jedisPool.getResource();
    try {
        redis.clients.jedis.Pipeline pipelined = jedis.pipelined();
        pipelined.rpush(java.lang.String.format(com.github.wens.mq.RedisMessageQueue.TOPIC_PREFIX, topic).getBytes(), data);
        pipelined.publish("_queue_", topic);
        pipelined.sync();
    } finally {
        if (jedis != null) {
            jedis.close();
        }
    }
}