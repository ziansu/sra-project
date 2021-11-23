@java.lang.Override
public org.neo4j.collection.primitive.PrimitiveLongIterator nodesGetAll(org.neo4j.kernel.impl.api.KernelStatement state) {
    java.lang.System.out.println("GETTING ALL NODES");
    org.neo4j.collection.primitive.PrimitiveLongIterator committed = storeLayer.nodesGetAll();
    return state.txState().augmentNodesGetAll(committed);
}