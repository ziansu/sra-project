@java.lang.Override
public void prepare(java.util.Map stormConf, backtype.storm.task.TopologyContext context) {
    int boltId = context.getThisTaskId();
    int basePort = 6300;
    int thisPort = (basePort % boltId) + boltId;
    jedis = new redis.clients.jedis.Jedis("localhost", thisPort);
}