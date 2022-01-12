public void open(java.util.Map conf, backtype.storm.task.TopologyContext context, backtype.storm.spout.SpoutOutputCollector collector) {
    this.stormConfMap = conf;
    this.collector = collector;
    super.open(conf, context, null);
    openZookeeper(conf);
    com.di.mesa.plugin.zookeeper.storm.spout.ZookeeperSpout.logger.info("task id {} has opened", taskId);
}