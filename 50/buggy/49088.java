@java.lang.Override
protected io.netty.handler.codec.redis.FullBulkStringRedisMessage beginAggregation(io.netty.handler.codec.redis.BulkStringHeaderRedisMessage start, io.netty.buffer.ByteBuf content) throws java.lang.Exception {
    switch (start.bulkStringLength()) {
        case RedisConstants.NULL_VALUE :
            return FullBulkStringRedisMessage.NULL_INSTANCE;
        case 0 :
            return FullBulkStringRedisMessage.EMPTY_INSTANCE;
        default :
            return new io.netty.handler.codec.redis.FullBulkStringRedisMessage(content);
    }
}