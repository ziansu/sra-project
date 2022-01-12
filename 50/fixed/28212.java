@java.lang.Override
public org.neo4j.collection.primitive.PrimitiveLongIterator nodesGetAll(org.neo4j.kernel.impl.api.KernelStatement state) {
    return state.txState().augmentNodesGetAll(storeLayer.nodesGetAll());
}