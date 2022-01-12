@java.lang.Override
public org.apache.flink.api.java.tuple.Tuple2<K, E> join(org.gradoop.io.impl.graph.tuples.ImportEdge<K> importEdge, org.apache.flink.api.java.tuple.Tuple2<K, org.gradoop.model.impl.id.GradoopId> vertexIdPair) throws java.lang.Exception {
    reuseTuple.f0 = importEdge.getTargetVertexId();
    E edge = edgeFactory.createEdge(importEdge.getLabel(), vertexIdPair.f1, org.gradoop.model.impl.id.GradoopId.get(), importEdge.getProperties());
    reuseTuple.f1 = updateLineage(edge, importEdge.getId());
    java.lang.System.out.println("##########################");
    java.lang.System.out.println(importEdge);
    java.lang.System.out.println(vertexIdPair);
    java.lang.System.out.println(reuseTuple);
    return reuseTuple;
}