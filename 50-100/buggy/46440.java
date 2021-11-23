@java.lang.Override
public void prepare(java.util.Map stormConf, backtype.storm.task.TopologyContext context) {
    int boltId = context.getThisTaskId();
    int basePort = 6300;
    int thisPort = ((basePort % boltId) + boltId) + 1;
    jedis = new redis.clients.jedis.Jedis("localhost", thisPort);
    this.minHeap = new com.wordindexstorm.MinHeap(k);
}