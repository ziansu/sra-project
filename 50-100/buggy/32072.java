public <T> void publish(java.lang.String topic, T message) {
    redis.clients.jedis.Jedis jedis = jedisPool.getResource();
    try {
        redis.clients.jedis.Pipeline pipelined = jedis.pipelined();
        pipelined.rpush(java.lang.String.format(com.github.wens.mq.RedisMessageQueue.TOPIC_PREFIX, topic).getBytes(), com.github.wens.mq.Serializers.encode(message));
        pipelined.publish("_queue_", topic);
        pipelined.sync();
    } finally {
        if (jedis != null) {
            jedis.close();
        }
    }
}