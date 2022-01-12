@java.lang.Override
public void nextTuple() {
    if ((pointer) < (events.length)) {
        java.lang.String data = events[pointer];
        collector.emit(new backtype.storm.tuple.Values(data));
        org.shirdrn.storm.analytics.utils.TestUtils.TestSpout.LOG.info(("Spout emitted: " + data));
        ++(pointer);
        backtype.storm.utils.Utils.sleep(1);
    }else {
        backtype.storm.utils.Utils.sleep(5);
        pointer = 0;
    }
}