public static void main(java.lang.String[] args) {
    org.springframework.data.redis.listener.RedisMessageListenerContainer listenerContainer = de.adesso.redis.RedisHelper.setupRedisListenerContainer();
    org.springframework.data.redis.listener.adapter.MessageListenerAdapter listener = new org.springframework.data.redis.listener.adapter.MessageListenerAdapter();
    listener.setDelegate(new de.adesso.redis.RedisEMailReaderMessaging());
    listener.setDefaultListenerMethod("handleMessage");
    listener.setSerializer(new org.springframework.data.redis.serializer.StringRedisSerializer());
    listenerContainer.addMessageListener(listener, new org.springframework.data.redis.listener.ChannelTopic("emails"));
    listenerContainer.afterPropertiesSet();
    listenerContainer.start();
}