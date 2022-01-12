private void responseOnNext(final rx.Subscriber<? super io.netty.handler.codec.redis.RedisMessage> subscriber, final io.netty.handler.codec.redis.RedisMessage respmsg) {
    if (unholdRespSubscriber(subscriber)) {
        try {
            subscriber.onNext(respmsg);
        } finally {
            removeRespHandler();
            clearTransacting();
            subscriber.onCompleted();
        }
    }
}