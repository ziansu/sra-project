@java.lang.Override
public long nodeCreate(org.neo4j.kernel.impl.api.KernelStatement state) {
    long nodeId = storeLayer.reserveNode();
    state.txState().nodeDoCreate(nodeId);
    java.lang.System.out.println(("NODE CREATED WITH ID " + nodeId));
    return nodeId;
}