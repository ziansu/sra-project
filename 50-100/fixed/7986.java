@java.lang.SuppressWarnings(value = "unchecked")
private void takeFromInternalBuffer(backtype.storm.tuple.Tuple input) {
    operator.merger.MergerEntry nextReady = sharedChannels.getNextReadyObj(("" + (thisTask)), channelID);
    while (nextReady != null) {
        process(new backtype.storm.tuple.TupleImpl(context, ((java.util.List<java.lang.Object>) (nextReady.getO())), input.getSourceTask(), input.getSourceStreamId()));
        nextReady = sharedChannels.getNextReadyObj(("" + (thisTask)), channelID);
    } 
}