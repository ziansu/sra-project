@java.lang.Override
public void run() {
    try {
        redis.InfosWorker.log("Connecting");
        redis.clients.jedis.Jedis jedis = new redis.clients.jedis.Jedis(redis.InfosWorker.JEDIS_SERVER);
        redis.InfosWorker.log("subscribing");
        jedis.subscribe(jedisPubSub, redis.InfosWorker.QUEUE_NAME);
        redis.InfosWorker.log("subscribe returned, closing down");
        jedis.quit();
    } catch (java.lang.Exception e) {
        redis.InfosWorker.log((">>> OH NOES Sub - " + (e.getMessage())));
    }
}