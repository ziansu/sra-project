@java.lang.Override
public void write(com.hazelcast.nio.ObjectDataOutput out, com.dataloom.linking.aggregators.LightestEdgeAggregator object) throws java.io.IOException {
    com.dataloom.linking.WeightedLinkingEdge edge = object.aggregate();
    if (edge == null) {
        out.writeBoolean(false);
    }else {
        com.dataloom.hazelcast.serializers.WeightedLinkingEdgeStreamSerializer.serialize(out, edge);
    }
}