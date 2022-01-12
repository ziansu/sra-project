public static backtype.storm.generated.StormTopology buildTopology(storm.trident.spout.IBatchSpout spout) throws java.io.IOException {
    final storm.trident.TridentTopology topology = new storm.trident.TridentTopology();
    topology.newStream("spout", spout).each(new backtype.storm.tuple.Fields("tweet"), new com.microsoft.example.WordSeperator(), new backtype.storm.tuple.Fields("word")).groupBy(new backtype.storm.tuple.Fields("word")).each(new backtype.storm.tuple.Fields("word"), new com.microsoft.example.OutFormatter(), new backtype.storm.tuple.Fields("outtext")).each(new backtype.storm.tuple.Fields("outtext"), new storm.trident.operation.builtin.Debug());
    return topology.build();
}