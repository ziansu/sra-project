@java.lang.Override
public void execute(org.apache.storm.tuple.Tuple input, org.apache.storm.topology.BasicOutputCollector collector) {
    java.lang.String string = input.getStringByField(ConStant.FIELD);
    logger.info(string);
}