@java.lang.Override
public void execute(backtype.storm.tuple.Tuple tuple) {
    java.lang.String ChannelCode = tuple.getStringByField("channelCode");
    long timeStamp = tuple.getLongByField("timeStamp");
    float value = tuple.getFloatByField("value");
    if (channelSet.contains(ChannelCode)) {
        if (isFirst) {
            getQueryMap.setFirstTimestamp(timeStamp);
            isFirst = false;
        }
        _collector.emit(new backtype.storm.tuple.Values(ChannelCode, timeStamp, value));
    }
}